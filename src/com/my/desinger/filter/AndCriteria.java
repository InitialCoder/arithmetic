package com.my.desinger.filter;

import java.util.List;

public class AndCriteria implements Criteria<Person>{

	private Criteria<Person> criteria;
	private Criteria<Person> otherCriteria;
	
	public  AndCriteria(Criteria<Person> criteria,Criteria<Person> othercriteria) {
		this.criteria=criteria;
		this.otherCriteria=othercriteria;
	}
	
	@Override
	public List<Person> meetCritera(List<Person> list) {
		List<Person> result= criteria.meetCritera(list);
		result =otherCriteria.meetCritera(result);
		return result;
	}

}
