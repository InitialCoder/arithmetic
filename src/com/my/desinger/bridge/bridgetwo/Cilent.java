package com.my.desinger.bridge.bridgetwo;

import com.my.desinger.bridge.bridgetwo.bank.Bank;
import com.my.desinger.bridge.bridgetwo.bank.GongShangBank;

public class Cilent {

	public static void main(String[] args) {
		PayMoney moneyType=new DollarPay();
		
		Bank gongshang=new GongShangBank();
		gongshang.setPayMoney(moneyType);
		gongshang.pay();
	}
}
