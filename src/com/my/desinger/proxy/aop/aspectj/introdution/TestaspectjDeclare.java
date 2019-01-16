package com.my.desinger.proxy.aop.aspectj.introdution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.desinger.proxy.aop.introdution.Love;
import com.my.desinger.proxy.aop.programing.Greeting;

public class TestaspectjDeclare {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-aop/aspectjdeclare-bean.xml");
		Greeting greet=(Greeting) context.getBean("greetingImpl");
		
		greet.sayHello("zhou");
		Love love=(Love)greet;
		love.display("zhou");
	}
}
