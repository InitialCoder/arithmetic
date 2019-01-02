package com.my.desinger.decorator.coffeebar.decorator;

import com.my.desinger.decorator.coffeebar.Drink;

public class Milk extends Decorator{

	public Milk(Drink obj) {
		super(obj);
		super.setDiscript("milk");
		super.setPrice(1.0f);
	}

}
