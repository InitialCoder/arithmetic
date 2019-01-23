package com.my.desinger.chainOfResponsibity.simple;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class Client1 {

	public static void main(String[] args) {

		DebugLogger debug = new DebugLogger(); 
		InfoLogger info = new InfoLogger();
		ErrorLogger error = new ErrorLogger();
		
		debug.setNextLogger1(info).setNextLogger1(error);
		
		Tesk tesk=new Tesk("for test error",TeskTypeEnum.ERROR.typeName);
		
		debug.dojob(tesk);
		
	}
}
