package com.my.desinger.singleton;

public class LazySingleton {

	private static LazySingleton instance=null;
	
	private LazySingleton(){
		
	}
	//线程不安全
	public static LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
	
	//线程安全，但效率不高
	public synchronized static LazySingleton getInstance1(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
}
