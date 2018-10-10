package com.my.desinger.factory;

public class SmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("send a phone message!!");
	}

}
