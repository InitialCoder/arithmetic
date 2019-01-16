package com.my.desinger.proxy.aop.introdution;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

@Component
public class LoveAdvice extends DelegatingIntroductionInterceptor implements Love{

	@Override
	public void display(String name) {
		System.out.println("you are my foever love "+ name);
	}

	@Override
	public Object invoke(MethodInvocation invovation) throws Throwable {
		
		return super.invoke(invovation);
	}
	
}
