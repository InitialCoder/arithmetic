package com.my.desinger.factory.abstractfactory;

import com.my.desinger.factory.EmailSender;
import com.my.desinger.factory.Sender;

public class EmailFactory implements Provider{

	@Override
	public Sender produce() {
		
		return new EmailSender();
	}

	public void print(){
		System.out.println("aaaaaaaaaaaaaaaaa");
	}
	
}
