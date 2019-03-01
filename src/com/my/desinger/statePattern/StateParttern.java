package com.my.desinger.statePattern;

import com.my.desinger.statePattern.states.StartState;

/**
 * 状态模式：类的结构和策略模式类型，方法调用上也和责任链模式类似。主要是为控制状态而达到改变类的执行。
 * 
 *
 * @ClassName: StateParttern 
 * @Description: TODO
 * @author wu
 * @date 2019-02-28 15:12:06
 *
 */
public class StateParttern {
	
	public static void main(String[] args) {
		Context context = new Context();
		context.SetState(new StartState());
		
		context.submit();
		context.submit();
		context.submit();
		context.submit();
		
	}
	
}
