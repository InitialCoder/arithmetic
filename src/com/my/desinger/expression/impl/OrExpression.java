package com.my.desinger.expression.impl;

import com.my.desinger.expression.Expression;

public class OrExpression implements Expression{
	
	Expression exp1;
	Expression exp2;
	
	public OrExpression(Expression exp1,Expression exp2) {
		this.exp1=exp1;
		this.exp2=exp2;
	}

	@Override
	public boolean interpret(String context) {
		return exp1.interpret(context)||exp2.interpret(context);
	}
	
	
}
