package com.my.desinger.proxy.aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.desinger.proxy.aop.pattern.GreetingOtherImpl;
import com.my.desinger.proxy.aop.programing.Greeting;
/**
 * spring 拦截式代理
 * 
 * aspectj-xml 配置 属性proxy-target-class默认为false，代表只代理接口，也就是说只能将代理转型为Greeting，而不能是GreetingImpl
 *
 * @ClassName: TestAspectj 
 * @Description: TODO
 * @author wu
 * @date 2019-01-15 15:19:65
 *
 */
public class TestAspectj {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aop/aspectj-bean.xml");
		Greeting greet=(Greeting) context.getBean("greetingImpl");
		
		greet.sayHello("zhou");
		
		GreetingOtherImpl other = (GreetingOtherImpl) greet;
		other.goodMorning("zhou");
		other.goodNight("zhou");
	}
}
