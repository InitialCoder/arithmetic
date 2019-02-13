package com.my.desinger.command.base.orders.impl;

import com.my.desinger.command.base.orders.Order;
import com.my.desinger.command.base.Stock;

public class SellStock implements Order {

	private Stock sellStock;
	
	public SellStock(Stock sellStock) {
		this.sellStock=sellStock;
	}
	
	@Override
	public void execute() {
		sellStock.buy();
	}

	
}
