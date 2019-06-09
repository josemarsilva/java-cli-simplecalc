package br.com.josemarsilva.java_simplecalc_cli;

import org.apache.commons.cli.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	
    	// new CLI
    	CLI cli = new CLI(args);
    	
    	// new Calculator
    	Calculator calculator= new Calculator();
    	
    	// Calculate expression
    	System.out.println(calculator.evaluteExpression(cli.getExpression()));
    	
    }
}
