package com.my.desinger.prototype.simpleandfactory.extend;

public abstract class Parent {

	private String id;
	
	protected String type;

	abstract void say();
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
