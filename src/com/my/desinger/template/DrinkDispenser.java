package com.my.desinger.template;

public abstract class DrinkDispenser {


	protected String name;
	
	public final void makeADrink(){
		boilWater();
		addDrinkMateril();
		mixDrink();
		if(hook()){
			addSurger();
		}
		giveDrinkToYou();
		
	}
	
	public final void boilWater(){
		System.out.println("boil a hot water ");
	}

	public abstract void addDrinkMateril();
	
	public final void mixDrink(){
		
		System.out.println("mix drink ");
	}
	
	public final void addSurger(){
		System.out.println(" add Surger");
	}
	
	public abstract boolean hook();
	
	public final void giveDrinkToYou(){
		System.out.println("give the "+getName()+" to you");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
