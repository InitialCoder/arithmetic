package com.my.desinger.filter;

public class Person {

	private int age;
	private String gender;
	private String maritalStatus;

	public Person(int age) {
		this.age=age;
	}
	
	public Person(int age, String gender,String maritalStatus){
		this.age=age;
		this.gender=gender;
		this.maritalStatus=maritalStatus;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
}
