package com.my.desinger.command.remoteControll.commanImpl;

import com.my.desinger.command.remoteControll.ICommand;
import com.my.desinger.command.remoteControll.receives.HeaterReceive;

public class HeaterOnCommandImpl implements ICommand{

	private HeaterReceive heaterReceive;
	
	public HeaterOnCommandImpl(HeaterReceive heaterReceive) {
		this.heaterReceive = heaterReceive;
	}
	
	@Override
	public void execute() {
		System.out.println(" execute this command: ");
		heaterReceive.on();
		System.out.println("------------");
	}
}
