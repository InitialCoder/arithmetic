package com.my.desinger.mediator;

import com.my.desinger.mediator.colleagues.ColleagueImpl;
import com.my.desinger.mediator.mediators.MediatorImpl;

/**
 * 中介者模式：赌钱后钱的计算场景
 *
 * @ClassName: MediatorDemo 
 * @Description: TODO
 * @author wu
 * @date 2019-02-28 09:11:58
 *
 */
public class MediatorDemo {

	public static void main(String[] args) {
		
		ColleagueImpl col1 = new ColleagueImpl("col1",100);
		ColleagueImpl col2 = new ColleagueImpl("col2",200);
		
		Mediator mediator = new MediatorImpl();
		
		mediator.col1wincol2(10, col1, col2);
		System.out.println(col1);
		System.out.println(col2);
		mediator.col2Wincol1(20, col1, col2);
		System.out.println(col1);
		System.out.println(col2);
		
	}
}
