package com.my.desinger.command.remoteControll.receives;

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
