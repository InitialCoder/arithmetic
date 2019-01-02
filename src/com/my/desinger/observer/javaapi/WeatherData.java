package com.my.desinger.observer.javaapi;

/**
 * 关注的数据对象
 * @author wu
 *
 */
public class WeatherData {

	private float temperature;
	private float pressure;
	private float humily;
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getHumily() {
		return humily;
	}
	public void setHumily(float humily) {
		this.humily = humily;
	}
	
}
