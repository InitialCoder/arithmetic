package com.my.desinger.strategy.contect;

import com.my.desinger.strategy.Behavior;
import com.my.desinger.strategy.bahavior.FlyBehavior;
import com.my.desinger.strategy.bahavior.WalkBehavior;

public class TravelToGuangZhou {

	private Behavior h1=new FlyBehavior();
	private	Behavior h2=new WalkBehavior();
	
	public void excuteBehavior(){
		h1.action();
		h2.action();
	}
}
