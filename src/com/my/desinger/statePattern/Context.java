package com.my.desinger.statePattern;

public class Context {

	IState state;
	
	public void SetState(IState state){
		this.state=state;
	}
	
	public void submit(){
		state.submit(this);
	}
}
