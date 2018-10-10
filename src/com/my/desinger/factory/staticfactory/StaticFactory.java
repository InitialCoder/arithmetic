package com.my.desinger.factory.staticfactory;

import com.my.desinger.factory.EmailSender;
import com.my.desinger.factory.Sender;
import com.my.desinger.factory.SmsSender;

/**
 * 静态工厂类
 * @author wu
 *
 */
public class StaticFactory {

	public static Sender getMailSender(){
		return new EmailSender();
	}
	
	public static Sender getSmsSender(){
		return new SmsSender();
	}
	
}
