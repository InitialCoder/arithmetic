package com.my.desinger.chainOfResponsibity.simple;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class ErrorLogger extends AbstractLogger{

	@Override
	protected boolean ismyjob(Tesk test) {
		if(test.getType().equals(TeskTypeEnum.ERROR.typeName)){
			return true;
		}
		return false;
	}

	@Override
	public void dojob(Tesk tesk) {
		if(ismyjob(tesk)){
			System.out.println("Error: " +tesk.getName());
		}else{
			getNextLogger().dojob(tesk);
		}
	}
}
