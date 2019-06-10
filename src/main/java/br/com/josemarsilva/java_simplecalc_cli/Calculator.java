/**
 * @author Josemar Silva
 * @see https://github.com/josemarsilva/java-simplecalc-cli
*/

package br.com.josemarsilva.java_simplecalc_cli;

import com.udojava.evalex.Expression;

/**
 * Calculator - Class responsible to evaluates a mathematical expression
 *
 */
public class Calculator {

	/*
	 * Calculator() - Constructor
	 * @return void
	 */
	public Calculator() {
		super();
	}
	
	/*
	 * evaluteExpression() - Results the evaluation of an expression passed as parameter
	 * @param expression String expression to be evaluated
	 * @return String expression evaluated
	 */
	String evaluteExpression(String expression) {
		Expression e = new Expression(expression);
		return e.eval().toString();
	}

}
