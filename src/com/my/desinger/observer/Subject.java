package com.my.desinger.observer;

public interface Subject {
	
	void registerObserver(Observer obs);
	
	void removeObserver(Observer obs);
	
	void notifyObservers(NotifyMessage msg);
}
