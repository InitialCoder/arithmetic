package com.my.desinger.chainOfResponsibity.simple;

import com.my.desinger.chainOfResponsibity.Tesk;

public abstract class AbstractLogger {

	private AbstractLogger nextLogger;
	
	protected abstract boolean ismyjob(Tesk test);

	public AbstractLogger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	/**
	 * 此方法可以避免重复使用  对象.set();
	 *
	 * @Title:  setNextLogger1 
	 * @Description: 
	 * @param nextLogger
	 * @return AbstractLogger     
	 *
	 * @author：wu  
	 * @date：2019-01-23 16:44:99
	 *
	 */
	public AbstractLogger setNextLogger1(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
		return nextLogger;
	}
	
	
	public void dojob(Tesk tesk){
		System.out.println("do job "+ tesk.getName());
	}
	
}
