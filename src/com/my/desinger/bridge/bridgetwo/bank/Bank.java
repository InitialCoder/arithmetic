package com.my.desinger.bridge.bridgetwo.bank;

import com.my.desinger.bridge.bridgetwo.PayMoney;

public abstract class Bank {
	
	public PayMoney payMoney;
	
	public void setPayMoney(PayMoney payMoney){
		this.payMoney=payMoney;
	}
	
	public abstract void pay();
	
	
}
