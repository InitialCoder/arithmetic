package com.my.desinger.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria<Person> {
	
	@Override
	public List<Person> meetCritera(List<Person> list) {
		 List<Person> malePerson=new ArrayList<Person>();
		 for (Person person : malePerson) {
			if(person.getGender().equalsIgnoreCase("male")){
				malePerson.add(person);
			}
		}
		 return malePerson;
	}

}
