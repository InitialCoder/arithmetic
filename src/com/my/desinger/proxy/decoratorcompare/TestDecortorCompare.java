package com.my.desinger.proxy.decoratorcompare;

import com.my.desinger.proxy.Actor;

public class TestDecortorCompare {

	public static void main(String[] args) {
		System.out.println("演员演出前需要化妆！");
		ActorDecorator deo=new ActorDecorator(new Actor("周杰伦"));
		deo.show();
	}
}
