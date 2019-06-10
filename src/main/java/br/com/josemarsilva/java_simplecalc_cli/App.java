/**
 * @author Josemar Silva
 * @see https://github.com/josemarsilva/java-simplecalc-cli
*/

package br.com.josemarsilva.java_simplecalc_cli;

import org.apache.commons.cli.ParseException;

/**
 * App - mainClass manifest in pom.xml
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
    	if (!cli.getExpression().contentEquals("")) {
    		System.out.println(calculator.evaluteExpression(cli.getExpression()));
    	}
    	
    }
}
