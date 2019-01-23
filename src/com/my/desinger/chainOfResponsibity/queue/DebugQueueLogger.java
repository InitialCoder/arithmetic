package com.my.desinger.chainOfResponsibity.queue;

import com.my.desinger.chainOfResponsibity.Tesk;
import com.my.desinger.chainOfResponsibity.TeskTypeEnum;

public class DebugQueueLogger implements AbstractQueueLogger{

	@Override
	public boolean ismyjob(Tesk test) {
		if(test.getType().equals(TeskTypeEnum.DEBUG.typeName)){
			return true;
		}
		return false;
	}

	@Override
	public void dojob(Tesk tesk) {
		if(ismyjob(tesk)){
			System.out.println("Error: " +tesk.getName());
		}
	}
}
