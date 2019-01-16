package com.my.desinger.proxy.aop.autoproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.desinger.proxy.aop.pattern.GreetingOtherImpl;
/**
 * 
 *spring根据Bean名称来生成自动代理 
 *
 * @ClassName: TestAutoProxy 
 * @Description: TODO
 * @author wu
 * @date 2019-01-15 10:09:93
 *
 */
public class TestAutoProxy2 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aop/autoproxy2-bean.xml");
		GreetingOtherImpl greetImpl=(GreetingOtherImpl)context.getBean("greetingImpl");
	
		greetImpl.sayHello("15646");
		greetImpl.goodMorning("周");
	}
}
