package com.my.desinger.command.remoteControll.commanImpl;

import com.my.desinger.command.remoteControll.receives.TVReceive;
/**
 * 打开电视机具体命令实现
 *
 * @ClassName: TVOnCommandImpl 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 15:33:07
 *
 */

public class TVOnCommandImpl implements ICommand{

	private TVReceive tvReceive;
	
	public TVOnCommandImpl(TVReceive tvReceive) {
		this.tvReceive = tvReceive;
	}
	
	@Override
	public void execute() {
		System.out.println("execute this command :");
		tvReceive.on();
		System.out.println("------------");
	}

}
