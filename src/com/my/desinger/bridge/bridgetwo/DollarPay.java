package com.my.desinger.bridge.bridgetwo;

public class DollarPay implements PayMoney{

	@Override
	public void pay(String bankName, int number) {
		System.out.println(bankName+"pay "+number+"dollars  to  sombody" );
		
	}

	
}
