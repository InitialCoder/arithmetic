package com.my.desinger.statePattern.states;

import com.my.desinger.statePattern.Context;
import com.my.desinger.statePattern.IState;

public class WorkingState implements IState{

	@Override
	public void submit(Context context) {
		System.out.println("------------------------working state");
		context.SetState(new EndState());
	}

}
