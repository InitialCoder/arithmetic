package com.my.desinger.decorator.simple;

public abstract class Shape {
	
	private String descrip;
	
	public abstract void draw();

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
}
