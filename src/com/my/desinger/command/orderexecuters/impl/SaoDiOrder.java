package com.my.desinger.command.orderexecuters.impl;

import com.my.desinger.command.orderexecuters.OrderExecuter;

/**
 * 执行扫地任务
 *
 * @ClassName: SaoDiOrder 
 * @Description: TODO
 * @author wu
 * @date 2019-01-24 15:49:48
 *
 */
public class SaoDiOrder implements OrderExecuter{

	@Override
	public void execute() {
		System.out.println("执行命令----------------");
		System.out.println("---扫地---");
		System.out.println("---扫地---");
		System.out.println("---扫地---");
		System.out.println("---扫地---");
		System.out.println("---扫地---");
		System.out.println("---扫地---");
	}

}
