package com.my.desinger.bridge.shape.impl;

import com.my.desinger.bridge.shape.Shape;

public class Circle extends Shape{

	@Override
	public void draw() {
		color.paint("circle");
	}

}
