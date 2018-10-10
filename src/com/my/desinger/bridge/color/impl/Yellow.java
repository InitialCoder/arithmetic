package com.my.desinger.bridge.color.impl;

import com.my.desinger.bridge.color.Color;

public class Yellow implements Color {

	@Override
	public void paint(String shapename) {
		
		System.out.println("yellow"+shapename);
	}
}
