package com.my.desinger.factory.abstractfactory;

import com.my.desinger.factory.Sender;
import com.my.desinger.factory.SmsSender;

public class SmsFactory implements Provider {

	@Override
	public Sender produce() {
		 return new SmsSender();
	}

}
