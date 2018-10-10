package com.my.desinger.factory.staticfactory;

import com.my.desinger.factory.Sender;

public class Test {

	public static void main(String[] args) {
		Sender email=StaticFactory.getMailSender();
		Sender sms=StaticFactory.getMailSender();
		
		email.sender();
		sms.sender();
	}
}
