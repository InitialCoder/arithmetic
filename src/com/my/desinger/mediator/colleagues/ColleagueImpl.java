package com.my.desinger.mediator.colleagues;

import com.my.desinger.mediator.Colleague;

public class ColleagueImpl implements Colleague{

	private String name;

	private int money;
	
	
	public ColleagueImpl(String name,int money) {
		this.name=name;
		this.money = money;
	}
	
	@Override
	public void countMonery(int number) {
		this.money += number; 
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return this.name+"my money has:"+this.money;
	}
}
