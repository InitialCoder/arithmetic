package com.my.desinger.command.base.orders.impl;

import com.my.desinger.command.base.orders.Order;
import com.my.desinger.command.base.Stock;

public class BuyStock implements Order{

	private Stock buyStock;
	
	public BuyStock(Stock buyStock) {
		this.buyStock=buyStock;
	}
	
	@Override
	public void execute() {
		buyStock.buy();
		
	}

}
