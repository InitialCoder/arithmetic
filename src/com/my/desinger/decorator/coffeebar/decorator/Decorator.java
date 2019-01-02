package com.my.desinger.decorator.coffeebar.decorator;

import com.my.desinger.decorator.coffeebar.Drink;
/**
 * 加了调味品的咖啡的抽象类即装饰者的抽象
 * @author wu
 *
 */
public class Decorator extends Drink{

	private Drink obj;
	
	public Decorator(Drink obj){
		this.obj=obj;
	}
	
	@Override
	public float cost() {
		return super.getPrice()+obj.cost();
	}

	@Override
	public String getDiscript(){
		return super.getDiscript()+":"+super.getPrice()+"&&"+obj.getDiscript()+":"+obj.getPrice();
	}
}
