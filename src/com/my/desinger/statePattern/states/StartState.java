package com.my.desinger.statePattern.states;

import com.my.desinger.statePattern.Context;
import com.my.desinger.statePattern.IState;

public class StartState implements IState{

	@Override
	public void submit(Context context) {
		System.out.println("-------start state ");
		context.SetState(new WorkingState());
	}

	
}
