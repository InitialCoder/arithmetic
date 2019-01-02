package com.my.desinger.decorator.simple.shapes;

import com.my.desinger.decorator.simple.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		super.setDescrip("rectangle");
	}
	@Override
	public void draw() {
		System.out.println("drow a rectangle");
	}

}
