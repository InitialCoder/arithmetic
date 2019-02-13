package com.my.desinger.command.remoteControll.commanImpl;

import com.my.desinger.command.remoteControll.ICommand;
import com.my.desinger.command.remoteControll.receives.TVReceive;
/**
 * 关闭电视机具体命令实现
 *
 * @ClassName: TVOffCommandImpl 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 15:33:59
 *
 */
public class TVOffCommandImpl implements ICommand{

	private TVReceive tvReceive;
	
	public TVOffCommandImpl(TVReceive tvReceive) {
		this.tvReceive = tvReceive;
	}
	
	@Override
	public void execute() {
		System.out.println("execute this command :");
		tvReceive.off();
		System.out.println("------------");
	}

}
