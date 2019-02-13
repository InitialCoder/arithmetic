package com.my.desinger.expression;

/**
 * 解释器模式，表达式接口
 *
 * @ClassName: Expression 
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 17:18:68
 *
 */
public interface Expression {

	public boolean interpret(String context);
	
}
