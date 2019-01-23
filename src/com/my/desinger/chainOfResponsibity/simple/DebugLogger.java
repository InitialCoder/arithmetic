package com.my.desinger.chainOfResponsibity.simple;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class DebugLogger extends AbstractLogger{

	@Override
	protected boolean ismyjob(Tesk test) {
		if(test.getType().equals(TeskTypeEnum.DEBUG.typeName)){
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
