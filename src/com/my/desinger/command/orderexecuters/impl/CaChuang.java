package com.my.desinger.command.orderexecuters.impl;

import com.my.desinger.command.orderexecuters.OrderExecuter;

/**
 * 执行擦窗任务
 *
 * @ClassName: cachuang 
 * @Description: TODO
 * @author wu
 * @date 2019-01-24 15:49:48
 *
 */
public class CaChuang implements OrderExecuter{
	
	@Override
	public void execute() {
		System.out.println("执行命令----------------");
		System.out.println("---擦窗---");
		System.out.println("---擦窗---");
		System.out.println("---擦窗---");
		System.out.println("---擦窗---");
	}

}
