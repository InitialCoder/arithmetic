package com.my.desinger.decorator.coffeebar.decorator;

import com.my.desinger.decorator.coffeebar.Drink;

public class Chocolate extends Decorator{

	public Chocolate(Drink obj) {
		super(obj);
		super.setDiscript("Chocolate");
		super.setPrice(1.2f);
	}

}
