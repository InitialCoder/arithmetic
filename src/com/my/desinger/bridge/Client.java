package com.my.desinger.bridge;

import com.my.desinger.bridge.color.Color;
import com.my.desinger.bridge.color.impl.Red;
import com.my.desinger.bridge.shape.impl.Circle;
import com.my.desinger.bridge.shape.impl.Rectangle;

public class Client {

	public static void main(String[] args) {
		
		Color red=new Red();
		Circle circle=new Circle();
		circle.setColor(red);
		circle.draw();
		
		Rectangle rectangle=new Rectangle();
		rectangle.setColor(red);
		rectangle.draw();
	}
}
