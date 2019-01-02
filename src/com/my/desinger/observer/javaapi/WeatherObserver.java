package com.my.desinger.observer.javaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * @author wu
 *
 */
public class WeatherObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		WeatherData  data=(WeatherData) arg;
		System.out.println(data.getTemperature());
	}

	
}
