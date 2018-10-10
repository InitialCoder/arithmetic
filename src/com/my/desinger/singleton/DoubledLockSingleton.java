package com.my.desinger.singleton;

public class DoubledLockSingleton {

	private volatile static DoubledLockSingleton instance;
	
	public static DoubledLockSingleton getIntance(){
		if(instance==null){
			synchronized (DoubledLockSingleton.class) {
				if(instance==null){
					instance=new DoubledLockSingleton();
				}
			}
		}
		return instance;
	}
	
	private DoubledLockSingleton(){
		
		
	}
}
