package com.my.desinger.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.my.desinger.flyweight.Shape;
import com.my.desinger.flyweight.concrete.Circle;

/**
 * 享元模式，管理对象的工厂,线程不安全的
 * 合适少量重复使用并且变化小的对象管理，能减少系统内存开支，实现对象的多次复用
 *
 * @ClassName: ShapeFactory 
 * @Description: TODO
 * @author wu
 * @date 2019-01-14 09:08:24
 *
 */
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
