package com.my.desinger.prototype.deep;

import java.io.Serializable;

public class Address implements Serializable{

	private String country;
	private String province;
	public Address(String country,String province) {
		this.country=country;
		this.province=province;
		
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	
}
