package com.my.desinger.observer.javaapi;
/**
 * 使用java pai 实现的观察者模式
 *
 * @ClassName: TestApiObserver 
 * @Description: TODO
 * @author wu
 * @date 2019-02-28 09:14:00
 *
 */
public class TestApiObserver {

	public static void main(String[] args) {
		WeatherSubject subject=new WeatherSubject();
		//注册观察者
		subject.addObserver(new WeatherObserver());
		
		WeatherData data=new WeatherData();
		data.setHumily(15.6f);
		data.setPressure(36.5f);
		data.setTemperature(20.5f);
		subject.setData(data);
	}
}
