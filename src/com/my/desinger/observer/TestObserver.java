package com.my.desinger.observer;

import com.my.desinger.observer.obss.ObserverCompany1;
import com.my.desinger.observer.obss.ObserverCompany2;
import com.my.desinger.observer.subs.SubjectImpl;

public class TestObserver {

	public static void main(String[] args) {
		SubjectImpl subject=new SubjectImpl();
		ObserverCompany1 co1=new ObserverCompany1();
		ObserverCompany2 co2=new ObserverCompany2();
		
		subject.registerObserver(co2);
		subject.registerObserver(co1);
		
		NotifyMessage msg=new NotifyMessage();
		msg.setHumidity(12.5f);
		msg.setPressure(1024f);
		msg.setTamperatrue(24.2f);
		
		subject.setData(msg);
		subject.notifyObservers(msg);
	}
}
