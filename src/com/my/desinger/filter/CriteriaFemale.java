package com.my.desinger.filter;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.filter.Person;

public class CriteriaFemale implements Criteria<Person>{

	@Override
	public List<Person> meetCritera(List<Person> list) {
		 List<Person> femalePerson=new ArrayList<Person>();
		 for (Person person : list) {
			if(person.getGender().equalsIgnoreCase("female")){
				femalePerson.add(person);
			}
		}
		 return femalePerson;
	}

	
}
