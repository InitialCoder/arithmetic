package com.my.desinger.facade;

import com.my.desinger.facade.subsystem.SystemA;
import com.my.desinger.facade.subsystem.SystemB;
import com.my.desinger.facade.subsystem.SystemC;

public class Facade {

	private SystemFace a = new SystemA();
	private SystemFace b = new SystemB();
	private SystemFace c = new SystemC();
	
	
	public void doAjob(){
		a.dojob();
	}
	public void doBjob(){
		b.dojob();
	}
	public void doCjob(){
		c.dojob();
	}
}
