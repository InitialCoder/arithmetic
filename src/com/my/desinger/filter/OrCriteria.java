package com.my.desinger.filter;

import java.util.List;

public class OrCriteria implements Criteria<Person>{
	
	private Criteria<Person> criteria;
	private Criteria<Person> otherCriteria;
	
	public OrCriteria(Criteria<Person> criteria,Criteria<Person> otherCriteria) {
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	
	@Override
	public List<Person> meetCritera(List<Person> list) {
		List<Person> list1=criteria.meetCritera(list);
		List<Person> list2=otherCriteria.meetCritera(list);
		for (Person person : list2) {
			if(!list1.contains(person)){
				list1.add(person);
			}
		}
		return list1;
	}
}