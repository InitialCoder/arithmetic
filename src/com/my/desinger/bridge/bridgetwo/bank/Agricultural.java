package com.my.desinger.bridge.bridgetwo.bank;

public class Agricultural extends Bank{

	@Override
	public void pay() {
		payMoney.pay("agricultural",1500);
	}
	
}
