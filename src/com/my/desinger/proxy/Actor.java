package com.my.desinger.proxy;

public class Actor implements IActor{

	private String name;
	
	public Actor(String name) {
		this.name=name;
	}
	
	@Override
	public void show() {
		System.out.println(this.name +"make a song show ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
