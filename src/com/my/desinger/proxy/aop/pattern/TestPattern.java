package com.my.desinger.proxy.aop.pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 基于正则表达式构件的AOP切面
 * @ClassName: TestPattern 
 * @Description: TODO
 * @author wu
 * @date 2019-01-15 09:47:77
 *
 */
public class TestPattern {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("pattern-bean.xml");
		GreetingOtherImpl greet=(GreetingOtherImpl) context.getBean("greetingProxy");
		greet.sayHello("周杰伦");
		greet.goodMorning("第二");
		greet.goodNight("第三 ");
	}
}
