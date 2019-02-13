package com.my.desinger.command.remoteControll.commanImpl;

import com.my.desinger.command.remoteControll.ICommand;
import com.my.desinger.command.remoteControll.receives.HeaterReceive;

public class HeaterOffCommandImpl implements ICommand{

	private HeaterReceive heaterReceive;
	
	public HeaterOffCommandImpl(HeaterReceive heaterReceive) {
		this.heaterReceive = heaterReceive;
	}
	
	@Override
	public void execute() {
		System.out.println(" execute this command");
		heaterReceive.off();
		System.out.println("------------");
	}

}
