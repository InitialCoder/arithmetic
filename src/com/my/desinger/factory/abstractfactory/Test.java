package com.my.desinger.factory.abstractfactory;

import com.my.desinger.factory.Sender;

public class Test {

	public static void main(String[] args) {
		Provider provider=new EmailFactory();
		Sender email=provider.produce();
		email.sender();
		
		
	}
}
