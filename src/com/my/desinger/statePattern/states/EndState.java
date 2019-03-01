package com.my.desinger.statePattern.states;

import com.my.desinger.statePattern.Context;
import com.my.desinger.statePattern.IState;

public class EndState implements IState{

	@Override
	public void submit(Context context) {
		System.out.println("--------------------------end state  is end");
		context.SetState(new StartState());
	}

	
}
