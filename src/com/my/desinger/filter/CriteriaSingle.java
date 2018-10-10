package com.my.desinger.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria<Person>{

	@Override
	public List<Person> meetCritera(List<Person> list) {
		List<Person> singlePerson=new ArrayList<Person>();
		 for (Person person : list) {
			if(person.getMaritalStatus().equalsIgnoreCase("single")){
				singlePerson.add(person);
			}
		}
		 return singlePerson;
	}

}
