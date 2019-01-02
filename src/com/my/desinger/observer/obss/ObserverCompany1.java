package com.my.desinger.observer.obss;

import com.my.desinger.observer.NotifyMessage;
import com.my.desinger.observer.Observer;

public class ObserverCompany1 implements Observer{
	
	private NotifyMessage msg;

	@Override
	public void update(NotifyMessage msg) {
		this.msg=msg;
		display();
	}

	public void display(){
		System.out.println("ob1 Temperature:"+msg.getTamperatrue());
		System.out.println("ob1 Pressure:"+msg.getPressure());
		System.out.println("ob1 Humidity:"+msg.getHumidity());
		
	}
	
}
