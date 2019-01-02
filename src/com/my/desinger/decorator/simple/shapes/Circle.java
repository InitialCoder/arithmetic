package com.my.desinger.decorator.simple.shapes;

import com.my.desinger.decorator.simple.Shape;

public class Circle extends Shape {

	public Circle() {
		super.setDescrip("circle");
	}
	@Override
	public void draw() {
		System.out.println("drow a circle");
	}
	
}
