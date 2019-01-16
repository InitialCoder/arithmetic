package com.my.desinger.proxy.aop.programing;

public class GreetingImpl implements Greeting{

	@Override
	public void sayHello(String name) {
		System.out.println("hello "+name);
	}

}
