package com.my.desinger.template;

public class CoffeeDrink extends DrinkDispenser{

	private boolean addSurger;
	
	public CoffeeDrink(boolean addSurger) {
		this.addSurger=addSurger;
		super.setName("coffee");
	}
	
	@Override
	public void addDrinkMateril() {
		// TODO Auto-generated method stub
		System.out.println("add coffee  powder");
	}

	@Override
	public boolean hook() {
		return addSurger;
	}

	
}
