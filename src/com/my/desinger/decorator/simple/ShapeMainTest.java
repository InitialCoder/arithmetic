package com.my.desinger.decorator.simple;

import com.my.desinger.decorator.simple.decorator.RedShapeDecorator;
import com.my.desinger.decorator.simple.shapes.Circle;
import com.my.desinger.decorator.simple.shapes.Rectangle;

public class ShapeMainTest {

	public static void main(String[] args) {
		Shape circle=new Circle();
		Shape rectangle=new Rectangle();
		circle.draw();
		System.out.println("--------------------------------");
		RedShapeDecorator red=new RedShapeDecorator(circle);
		red.draw();
		System.out.println("==================================");
		System.out.println(red.getDescrip());
		System.out.println("+++++++++++++++++++++++++++++++++");
		red.setObj(rectangle);
		red.draw();
		System.out.println(red.getDescrip());
	}
}
