package com.my.desinger.decorator.coffeebar;

public abstract class Drink {

	private String discript;
	
	private float price;

	public String getDiscript() {
		return discript+"&&"+price;
	}

	public void setDiscript(String discript) {
		this.discript = discript;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public abstract float cost();
	
}
