package com.my.desinger.factory;

public class EmailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("send a email");
	}

}
