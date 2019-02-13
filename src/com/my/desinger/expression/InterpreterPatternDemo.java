package com.my.desinger.expression;

import com.my.desinger.expression.impl.AndExpression;
import com.my.desinger.expression.impl.OrExpression;
import com.my.desinger.expression.impl.TerminalExpression;

/**
 * 根据已有表达式创建自己的规则
 *
 * @ClassName: InterpreterPatternDemo
 * @Description: TODO
 * @author wu
 * @date 2019-02-12 17:26:03
 *
 */
public class InterpreterPatternDemo {

	// 规则：Robert 和 John 是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// 规则：Julie 是一个已婚的女性
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	 public static void main(String[] args) {
	      Expression isMale = getMaleExpression();
	      Expression isMarriedWoman = getMarriedWomanExpression();
	      System.out.println("John is male? " + isMale.interpret("John"));
	      
	      System.out.println("Julie is a married women? " 
	      + isMarriedWoman.interpret("Married Julie"));
	   }
}
