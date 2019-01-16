package com.my.desinger.proxy.aop.around;

import org.springframework.aop.framework.ProxyFactory;

import com.my.desinger.proxy.aop.programing.Greeting;
import com.my.desinger.proxy.aop.programing.GreetingImpl;
/**
 * 环绕式方法织入
 *
 * @ClassName: TestAround 
 * @Description: TODO
 * @author wu
 * @date 2019-01-14 17:32:74
 *
 */
public class TestAround {

	public static void main(String[] args) {
		
		ProxyFactory proxyfactory=new ProxyFactory();
		proxyfactory.setTarget(new GreetingImpl());
		proxyfactory.addAdvice(new GreetingAroundAdvice());
		
		Greeting greet=(Greeting)proxyfactory.getProxy();
		greet.sayHello("111111111111");
	}
}
