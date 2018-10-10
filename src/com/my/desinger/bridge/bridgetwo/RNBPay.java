package com.my.desinger.bridge.bridgetwo;

public class RNBPay implements PayMoney{

	@Override
	public void pay(String bankName,int number) {
		System.out.println(bankName+"pay "+number+" RNB"+"to somebody");
		
	}

}
