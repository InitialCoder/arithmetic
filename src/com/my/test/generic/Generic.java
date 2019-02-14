package com.my.test.generic;

import com.my.test.Test;

public class Generic {

	public static <T> T getInstance(Class<T> c) throws InstantiationException, IllegalAccessException{
		T ins = c.newInstance(); 
		return ins;
	}
	
	public static void main(String[] args) {
		Test t ;
		try {
			 t= getInstance(Test.class);
			 t.m();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
}
