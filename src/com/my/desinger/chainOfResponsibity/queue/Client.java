package com.my.desinger.chainOfResponsibity.queue;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.chainOfResponsibity.Tesk;

public class Client {
	
	private List<AbstractQueueLogger> list;
	
	public Client() {
		list = new ArrayList<AbstractQueueLogger>();
	}
	
	public void excute(Tesk tesk){
		list.add(new DebugQueueLogger()); 
		list.add(new ErrorQueueLogger()); 
		list.add(new InfoQueueLogger()); 
		
		for (AbstractQueueLogger loger : list) {
			loger.dojob(tesk);
		}
	}
}
