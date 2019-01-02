package com.my.desinger.strategy.contect;

import com.my.desinger.strategy.Behavior;

public abstract class Context {

	protected Behavior behavior;
	 
	public void excuteStrategy(){
		behavior.action();
	}

	public Behavior getBehavior() {
		return behavior;
	}

	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
}
