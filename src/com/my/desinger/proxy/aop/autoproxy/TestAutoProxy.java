package com.my.desinger.proxy.aop.autoproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.desinger.proxy.aop.pattern.GreetingOtherImpl;
/**
 * 
 *spring 自动生成代理，
 *
 * @ClassName: TestAutoProxy 
 * @Description: TODO
 * @author wu
 * @date 2019-01-15 10:09:93
 *
 */
public class TestAutoProxy {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aop/autoproxy-bean.xml");
		GreetingOtherImpl greetImpl=(GreetingOtherImpl)context.getBean("greetingImpl");
	
		greetImpl.sayHello("aaaaaaaaaa66666666666666666666");
		greetImpl.goodMorning("周");
	}
}
