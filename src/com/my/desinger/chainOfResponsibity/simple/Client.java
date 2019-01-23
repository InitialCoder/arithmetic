package com.my.desinger.chainOfResponsibity.simple;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class Client {

	public static void main(String[] args) {
		
		DebugLogger debug = new DebugLogger(); 
		InfoLogger info = new InfoLogger();
		ErrorLogger error = new ErrorLogger();
		
		//装配整条责任链
		debug.setNextLogger(info);
		info.setNextLogger(error);
		
		Tesk tesk = new Tesk("for Test info", TeskTypeEnum.INFO.typeName);
		
		debug.dojob(tesk);
		
	}
}
