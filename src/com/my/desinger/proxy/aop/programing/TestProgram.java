package com.my.desinger.proxy.aop.programing;

import org.springframework.aop.framework.ProxyFactory;
/**
 * 编程式方法织入
 *
 * @ClassName: TestProgram 
 * @Description: TODO
 * @author wu
 * @date 2019-01-14 17:33:67
 *
 */
public class TestProgram {

	public static void main(String[] args) {
		System.out.println(args);
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new GreetingImpl());
		factory.addAdvice(new GreetingBeforeAndAfterAdvice());
		
		Greeting greet=(Greeting)factory.getProxy();
		greet.sayHello("111111111111");
	}
}
