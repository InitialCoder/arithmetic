package com.my.desinger.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	private OneClass instance;
	
	EnumSingleton(){
		instance=new OneClass();
	}
	public OneClass getInstance(){
		return instance;
	}
	
}
