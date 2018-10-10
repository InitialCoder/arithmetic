package com.my.desinger.singleton;

public class TestEnumSingle {

	public static void main(String[] args) {
	 OneClass cls =	EnumSingleton.INSTANCE.getInstance();
	 cls.print();
	}
}
