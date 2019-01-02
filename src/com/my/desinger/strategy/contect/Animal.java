package com.my.desinger.strategy.contect;

import com.my.desinger.strategy.Behavior;

public class Animal extends Context{
	
	public Animal(Behavior behavior){
		this.behavior=behavior;
	}
	
	public void excuteBehavior() {
		behavior.action();
	}
	
}
