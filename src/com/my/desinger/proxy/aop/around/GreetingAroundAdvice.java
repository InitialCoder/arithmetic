package com.my.desinger.proxy.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GreetingAroundAdvice implements MethodInterceptor{

	private void before(){
		System.out.println("before");
	}

	private void after(){
		System.out.println("after");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
		Object result= invocation.proceed();
		after();
		return result;
	}
}
