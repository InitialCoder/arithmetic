package com.my.desinger.decorator.simple.decorator;

import com.my.desinger.decorator.simple.Shape;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape obj) {
		super(obj);
		super.setDescrip("red");
	}

	@Override
	public void draw(){
		System.out.println("drow with red color:");
		obj.draw();
	}
	
	@Override
	public String getDescrip() {
		return super.getDescrip()+"&&"+obj.getDescrip();
	}
}
