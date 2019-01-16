package com.my.desinger.proxy.aop.aspectj.introdution;

import com.my.desinger.proxy.aop.introdution.Love;

public class LoveImpl implements Love{

	@Override
	public void display(String name) {
		System.out.println("love you my dear "+name);
		
	}

}
