package com.my.desinger.iterator;

import com.my.desinger.iterator.impl.PersonContainerImpl;

public class TestDemo {

	public static void main(String[] args) {
		
		PersonContainerImpl container = new PersonContainerImpl();
		for ( Iterator iter = container.getIterator(); iter.hasnext();) {
			Person p=(Person)iter.next();
			System.out.println(p);
		}
	}
}
