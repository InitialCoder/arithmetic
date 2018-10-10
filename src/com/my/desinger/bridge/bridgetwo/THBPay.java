package com.my.desinger.bridge.bridgetwo;

public class THBPay implements PayMoney{

	@Override
	public void pay(String bankName, int number) {
		System.out.println(bankName+"pay "+number +"THB to sombody!");
		
	}

}
