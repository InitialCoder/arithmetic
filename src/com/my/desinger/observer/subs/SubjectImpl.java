package com.my.desinger.observer.subs;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.observer.NotifyMessage;
import com.my.desinger.observer.Observer;
import com.my.desinger.observer.Subject;

public class SubjectImpl implements Subject{

	private List<Observer> obss=new ArrayList<Observer>();
	private NotifyMessage msg;
	
	@Override
	public void registerObserver(Observer obs) {
		if(obss.contains(obs)){
			System.out.println("this obs  is exists!");
			return ;
		}
			obss.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		if(obss.contains(obs)){
			obss.remove(obs);
		}
	}

	@Override
	public void notifyObservers(NotifyMessage msg) {
		obss.forEach(item->{item.update(msg);});
	}

	public void setData(NotifyMessage msg){
		this.msg=msg;
	}
}
