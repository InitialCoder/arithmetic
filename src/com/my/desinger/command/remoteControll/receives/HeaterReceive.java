package com.my.desinger.command.remoteControll.receives;

import com.my.desinger.command.remoteControll.Receive;

public class HeaterReceive implements Receive{

	@Override
	public void off() {
		System.out.println(" off this Heater ");
	}

	@Override
	public void on() {
		System.out.println(" on this Heater");
		
	}

}
