package com.my.desinger.decorator.simple.decorator;

import com.my.desinger.decorator.simple.Shape;

public class ShapeDecorator extends Shape{

	protected Shape obj;
	public ShapeDecorator(Shape obj) {
		this.obj=obj;
	}
	
	@Override
	public void draw() {
		obj.draw();
	}

	public Shape getObj() {
		return obj;
	}

	public void setObj(Shape obj) {
		this.obj = obj;
	}

}
