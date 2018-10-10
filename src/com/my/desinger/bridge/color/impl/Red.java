package com.my.desinger.bridge.color.impl;

import com.my.desinger.bridge.color.Color;

public class Red implements Color {

	@Override
	public void paint(String shapename) {
		System.out.println("Red"+shapename);
	}

}
