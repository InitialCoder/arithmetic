package com.my.desinger.memento;

import java.util.Stack;

public class MementStorage {
	
	private Stack<Memento> mements = new Stack<Memento>();
	
	public void add(Memento mto){
		mements.push(mto);
	}
	
	public Memento get(){
		return mements.pop();
	}
	

}
