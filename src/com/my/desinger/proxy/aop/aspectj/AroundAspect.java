package com.my.desinger.proxy.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

	/**
	 * 若 execution  的值为   * com.my.desinger.proxy.aop.pattern.Greeting.*(..))" 
	 * 则实现了Greeting 接口的方法都会被环绕代理，实现类其他方法不会被代理
	 *
	 * @Title:  around 
	 * @Description: 
	 * @param pjp
	 * @return
	 * @throws Throwable Object     
	 *
	 * @author：wu  
	 * @date：2019-01-15 15:24:50
	 *
	 */
	@Around("execution(* com.my.desinger.proxy.aop.pattern.GreetingOtherImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		before();
		Object obj=pjp.proceed();
		after();
		return obj;
	}
	
	private void before(){
		System.out.println("before");
	}
	
	private void after(){
		System.out.println("after");
	}
	
}
