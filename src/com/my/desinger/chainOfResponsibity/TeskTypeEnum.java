package com.my.desinger.chainOfResponsibity;

public enum TeskTypeEnum {

	ERROR("error"),
	INFO("info"),
	DEBUG("debug");
	
	public String typeName;
	
	private TeskTypeEnum(String typeName){
		this.typeName=typeName;
	}
	
}
