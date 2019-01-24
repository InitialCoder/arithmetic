package com.my.desinger.command.orderexecuters.impl;

import com.my.desinger.command.orderexecuters.OrderExecuter;

/**
 * 执行拖地任务
 *
 * @ClassName: tuodi 
 * @Description: TODO
 * @author wu
 * @date 2019-01-24 15:49:48
 *
 */
public class TuoDi implements OrderExecuter{

	@Override
	public void execute() {
		System.out.println("执行命令----------------");
		System.out.println("---拖地---");
		System.out.println("---拖地---");
		System.out.println("---拖地---");
		System.out.println("---拖地---");
		System.out.println("---拖地---");
	}

}
