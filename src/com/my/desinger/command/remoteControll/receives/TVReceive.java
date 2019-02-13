package com.my.desinger.command.remoteControll.receives;

import com.my.desinger.command.remoteControll.Receive;

/**
 * 电视机开关命令封装
 *
 * @ClassName: TVReceive 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 15:33:21
 *
 */
public class TVReceive implements Receive{

	@Override
	public void off() {
		System.out.println(" off this TV ");
		
	}

	@Override
	public void on() {
		System.out.println(" on this TV ");
	}

	
}
