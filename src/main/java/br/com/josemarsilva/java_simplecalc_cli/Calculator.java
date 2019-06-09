package br.com.josemarsilva.java_simplecalc_cli;

import com.udojava.evalex.Expression;

public class Calculator {

	/*
	 * Calculator() - Constructor
	 * @return void
	 */
	public Calculator() {
		super();
	}
	
	/*
	 * 
	 */
	String evaluteExpression(String expression) {
		Expression e = new Expression(expression);
		return e.eval().toString();
	}

}
