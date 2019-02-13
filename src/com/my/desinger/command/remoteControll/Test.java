package com.my.desinger.command.remoteControll;

import com.my.desinger.command.remoteControll.commanImpl.HeaterOffCommandImpl;
import com.my.desinger.command.remoteControll.commanImpl.HeaterOnCommandImpl;
import com.my.desinger.command.remoteControll.commanImpl.TVOffCommandImpl;
import com.my.desinger.command.remoteControll.commanImpl.TVOnCommandImpl;
import com.my.desinger.command.remoteControll.receives.HeaterReceive;
import com.my.desinger.command.remoteControll.receives.TVReceive;

public class Test {

	public static void main(String[] args) {
		RemoteController controller = new RemoteController();
		TVReceive tvReceive = new TVReceive();
		HeaterReceive heaterReceive = new HeaterReceive();
		
		TVOffCommandImpl tvoffCommand = new TVOffCommandImpl(tvReceive);
		TVOnCommandImpl tvonCommand = new TVOnCommandImpl(tvReceive);
		
		HeaterOffCommandImpl heateroff =new HeaterOffCommandImpl(heaterReceive);
		HeaterOnCommandImpl heateron =new HeaterOnCommandImpl(heaterReceive);
		
		
		controller.setCommand(1, tvoffCommand,tvonCommand);
		controller.setCommand(2, heateroff,heateron);
		
		
		controller.pressOffButton(1);
		controller.pressOffButton(2);
	}
}
