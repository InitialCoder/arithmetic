package com.my.desinger.proxy.aop.programing;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAndAfterAdvice implements MethodBeforeAdvice , AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("after runing"+args);
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before runing"+args);
	}

}
