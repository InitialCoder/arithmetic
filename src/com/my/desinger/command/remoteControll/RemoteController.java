package com.my.desinger.command.remoteControll;

import java.util.ArrayList;
import java.util.List;

/**
 * 遥控器实现
 *
 * @ClassName: RemoteController 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 15:42:18
 *
 */
public class RemoteController {

	final static int size = 10;
	List<ICommand> 	offInvokers = new ArrayList<ICommand>(size);
	List<ICommand> 	onInvokers = new ArrayList<ICommand>(size);
	
	public RemoteController() {
		NoCommand noCommand = new NoCommand(); 
		for (int i = 0; i < size; i++) {
			offInvokers.add(noCommand);
			onInvokers.add(noCommand);
		}
	}
	
	public void setCommand(int order , ICommand offCommand, ICommand onCommand){
		offInvokers.set(order,offCommand);
		onInvokers.set(order,onCommand);
	}
	
	public void pressOffButton(int slot){
		System.out.println(ButtonEnum.OFF);
		offInvokers.get(slot).execute();
	}
	
	public void pressOnButton(int slot){
		System.out.println(ButtonEnum.ON);
		onInvokers.get(slot).execute();
	}
	
}
