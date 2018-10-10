package com.my.desinger.bridge.shape;

import com.my.desinger.bridge.color.Color;

public abstract class Shape {
	protected Color color;
	
	public void setColor(Color color){
		this.color=color;
	}
	public abstract void draw();
}
