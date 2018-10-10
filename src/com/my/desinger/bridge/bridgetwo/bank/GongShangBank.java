package com.my.desinger.bridge.bridgetwo.bank;

public class GongShangBank extends Bank{

	@Override
	public void pay() {
		payMoney.pay("gongshang ", 100);
	}

}
