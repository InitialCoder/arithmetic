package com.my.desinger.expression.impl;

import com.my.desinger.expression.Expression;

/**
 * 定义作为上下文中主要解释器的 TerminalExpression 类。
 *
 * @ClassName: TerminalExpression 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 17:19:18
 *
 */
public class TerminalExpression implements Expression{

	private String data;
	
	public TerminalExpression(String data) {
		this.data=data;
	}
	
	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}

}
