package com.my.desinger.flyweight.concrete;

import com.my.desinger.flyweight.Shape;

public class Circle implements Shape{

	 private String color;
	   private int x;
	   private int y;
	   private int radius;
	   
	   
	   public Circle(String color){
		   this.color=color;
	   }
	   
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void drow() {
		 System.out.println("drow a circle:x:"+x+"y:"+y+"radius:"+radius+"-------"+this.hashCode());
	}

}
