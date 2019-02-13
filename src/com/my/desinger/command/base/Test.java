package com.my.desinger.command.base;

import com.my.desinger.command.base.orders.impl.BuyStock;
import com.my.desinger.command.base.orders.impl.SellStock;

public class Test {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
