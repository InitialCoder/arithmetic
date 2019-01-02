package com.my.desinger.observer.javaapi;

import java.util.Observable;

/**
 * 被观察者
 * @author wu
 *
 */
public class WeatherSubject extends Observable{

	private WeatherData  data;

	public WeatherData getData() {
		return data;
	}

	public void setData(WeatherData data) {
		this.data = data;
		//设置数据改变点
		super.setChanged();
		//提示观察者，并且把数据对象传输给他们
		super.notifyObservers(data);
		//只提示，但不传数据
		notifyObservers();
	}
	
	
}
