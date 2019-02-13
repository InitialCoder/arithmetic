package com.my.desinger.filter;

import java.util.ArrayList;
import java.util.List;

class Test{
	
	public static void main(String[] args) {
	      List<Person> persons = new ArrayList<Person>();
	 
	      persons.add(new Person(20,"Male", "Single"));
	      persons.add(new Person(30,"Male", "Married"));
	      persons.add(new Person(25,"Female", "Married"));
	      persons.add(new Person(30,"Female", "Single"));
	      persons.add(new Person(26,"Male", "Single"));
	      persons.add(new Person(24,"Male", "Single"));
	 
	      Criteria<Person> male = new CriteriaMale();
	      Criteria<Person> female = new CriteriaFemale();
	      Criteria<Person> single = new CriteriaSingle();
	      Criteria<Person> singleMale = new AndCriteria(single, male);
	      Criteria<Person> singleOrFemale = new OrCriteria(single, female);
	 
	      System.out.println("Males: ");
	      printPersons(male.meetCritera(persons));
	 
	      System.out.println("\nFemales: ");
	      printPersons(female.meetCritera(persons));
	 
	      System.out.println("\nSingle Males: ");
	      printPersons(singleMale.meetCritera(persons));
	 
	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCritera(persons));
	   }
	 
	   public static void printPersons(List<Person> persons){
	      for (Person person : persons) {
	         System.out.println("Person : [ age : " + person.getAge() 
	            +", Gender : " + person.getGender() 
	            +", Marital Status : " + person.getMaritalStatus()
	            +" ]");
	      }
	   } 
}
