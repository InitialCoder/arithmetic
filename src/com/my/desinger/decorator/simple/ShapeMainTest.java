package com.my.desinger.decorator.simple;

import com.my.desinger.decorator.simple.decorator.RedShapeDecorator;
import com.my.desinger.decorator.simple.shapes.Circle;
import com.my.desinger.decorator.simple.shapes.Rectangle;
/**
 * 装饰者模式，和代理模式的区别：
 * 1)装饰者模式是对原有代码的扩展
 * 2)代理模式是在原有对象使用不方便，在使用原对象之间添加一个代理类，代理类是如何方便使用该对象的一种封装。例如买火车票不需要去车站买，可以去代售点买
 * 3)者最主要的区别是：代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。而装饰模式中，装饰类对代理对象没有控制权，
 * 	只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 *
 * @ClassName: ShapeMainTest 
 * @Description: TODO
 * @author wu
 * @date 2019-01-14 09:00:85
 *
 */
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
