package com.my.desinger.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.my.desinger.flyweight.Shape;
import com.my.desinger.flyweight.concrete.Circle;

public class ShapeFactory {

	private static Map<String,Shape> shapeMap=new HashMap<String,Shape>();
	
	
	public static Shape getCircle(String color){
		Circle circle=(Circle) shapeMap.get(color);
		if(null==circle){
			circle=new Circle(color);
			shapeMap.put(color, circle);
		}
		return circle;
	}
}
