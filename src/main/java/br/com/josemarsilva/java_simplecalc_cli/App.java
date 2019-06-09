package br.com.josemarsilva.java_simplecalc_cli;

import org.apache.commons.cli.ParseException;

import br.com.josemarsilva.java_simplecalc_cli.CLI;

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
    	
    	System.out.println(cli.getExpression());
    	
    }
}
