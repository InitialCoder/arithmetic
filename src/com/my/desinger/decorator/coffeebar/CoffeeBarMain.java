package com.my.desinger.decorator.coffeebar;

import com.my.desinger.decorator.coffeebar.coffees.Decaf;
import com.my.desinger.decorator.coffeebar.coffees.Longblack;
import com.my.desinger.decorator.coffeebar.decorator.Chocolate;

/**
 * caffee 分很多单品：long/shortblack|espresso|decaf   等等
 * 咖啡往往能向其中加入其它调料：牛奶、糖、巧克力等等 
 * @author wu
 *
 */
public class CoffeeBarMain {

	public static void main(String[] args) {
		Drink order=null;
		order=new Decaf();
		System.out.println("order :"+order.getDiscript());
		System.out.println("order cost"+order.cost());
		
		System.out.println("----------");
//		order=new Longblack();
		order=new Chocolate(order);
		
		System.out.println("order1 "+order.getDiscript());
		System.out.println("order1 cost"+order.cost());
	}
}
