package com.my.desinger.proxy.aop.pattern;

import com.my.desinger.proxy.aop.programing.Greeting;

public class GreetingOtherImpl implements Greeting{

	@Override
	public void sayHello(String name) {
		System.out.println("hello"+name+"你掉毛了");
	}
	
	public void goodMorning(String name){
		System.out.println("goodMorning " +name+"");
	}

	public void goodNight(String name){
		System.out.println("good night " +name+"");
	}
}
