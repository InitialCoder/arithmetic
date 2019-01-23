package com.my.desinger.chainOfResponsibity.queue;

import com.my.desinger.chainOfResponsibity.Tesk;

/**
 * 每个责任点不维护下一个责任点的引用
 * 将下一个责任点的维护交个queue 
 *
 * @ClassName: AbstractQueueLogger 
 * @Description: TODO
 * @author wu
 * @date 2019-01-23 16:47:35
 *
 */
public interface AbstractQueueLogger {

	public boolean ismyjob(Tesk test);
	
	public void dojob(Tesk tesk);
}
