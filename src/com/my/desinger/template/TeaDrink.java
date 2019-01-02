package com.my.desinger.template;

public class TeaDrink extends DrinkDispenser{

	private boolean addSurger;
	
	public TeaDrink(boolean addSurger) {
		this.addSurger=addSurger;
		super.setName("tea");
	}
	
	@Override
	public void addDrinkMateril() {
		// TODO Auto-generated method stub
		System.out.println("add tea powder");
	}

	@Override
	public boolean hook() {
		return addSurger;
	}

	
}
