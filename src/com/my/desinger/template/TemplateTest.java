package com.my.desinger.template;

public class TemplateTest {

	
	public static void main(String[] args) {
		CoffeeDrink coffee=new CoffeeDrink(true);
		TeaDrink tea=new TeaDrink(false);
		
		coffee.makeADrink();
		tea.makeADrink();
	}
}
