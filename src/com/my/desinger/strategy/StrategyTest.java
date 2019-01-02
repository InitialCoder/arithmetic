package com.my.desinger.strategy;

import com.my.desinger.strategy.bahavior.FlyBehavior;
import com.my.desinger.strategy.bahavior.WalkBehavior;
import com.my.desinger.strategy.contect.Animal;

public class StrategyTest {

	public static void main(String[] args) {
		Animal animal=new Animal(new FlyBehavior());
		animal.excuteBehavior();
		
		animal.setBehavior(new WalkBehavior());
		animal.excuteBehavior();
	}
}
