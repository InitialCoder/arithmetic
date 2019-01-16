package com.my.desinger.proxy.aop.introdution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.desinger.proxy.aop.programing.GreetingImpl;
/**
 * 其他两种编程方式都是对方法的增强，即织入，现在是对类的增强，即引入式代理
 *
 * @ClassName: TestIntrodution 
 * @Description: TODO
 * @author wu
 * @date 2019-01-15 09:46:60
 *
 */
public class TestIntrodution {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-aop/spring-bean.xml");
		GreetingImpl greet=(GreetingImpl) context.getBean("greetingProxy");
		greet.sayHello("周杰伦");
		
		Love love=(Love)greet;
		love.display("周杰伦");
	}
}
