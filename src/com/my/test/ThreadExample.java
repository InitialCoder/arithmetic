package com.my.test;

public class ThreadExample extends Thread{

	private Test mv;
	public ThreadExample(Test mv){
		this.mv=mv;
	}
	public void run(){
		synchronized (mv) {
			mv.m();
		}
	}
}
