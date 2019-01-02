package com.my.desinger.decorator.coffeebar.coffees;

import com.my.desinger.decorator.coffeebar.Drink;
/**
 * 咖啡品种的超类
 * @author wu
 *
 */
public class Coffee extends Drink{

	@Override
	public float cost() {
		 return super.getPrice();
	}

}
