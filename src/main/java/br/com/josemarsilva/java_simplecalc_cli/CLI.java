/**
 * @author Josemar Silva
 * @see https://github.com/josemarsilva/java-simplecalc-cli
*/

package br.com.josemarsilva.java_simplecalc_cli;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLI {
	
	/*
	 * private final message constants
	 */
	private static final String JAVASIMPLECALC= new String("java-simplecalc-cli [options] [expression]\n" 
			+ "Java Simple Calculator Command Line - v.2019.06.08\n"
			+ "https://github.com/josemarsilva/java-simplecalc-cli\n"
			+ "Expression:\n"
			+ " Expression to be calculated. Ex: 1 + 1\n"
			+ "Options:");
	
	/*
	 * private properties
	 */
	private CommandLine cmd;

	/*
	 * CLI - Constructor
	 * @return void
	 */
	public CLI(String[] args) throws ParseException {
		super();
		parse(args);
		
	}
	
	
	/*
	 * getCmd - Getter
	 * @return cmd
	 */
	public CommandLine getCmd() {
		return cmd;
	}


	/*
	 * setCmd - Setter
	 * @param cmd Command Line to be set
	 * @return void
	 */
	public void setCmd(CommandLine cmd) {
		this.cmd = cmd;
	}


	/*
	 * Show complete formatted usage help
	 * @return void
	 */
	public void show_help(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp( JAVASIMPLECALC, options );
	}
	
	/*
	 * Parse command line
	 * @return void
	 */
	public void parse(String[] args) throws ParseException {
		// create Options object
		Options options = new Options();
		
		// add option "-h"
		options.addOption("h", false, "Show help usage information");
		
		// create a parser 
		CommandLineParser parser = new DefaultParser();
		
		// store parse command line 
		setCmd(parser.parse( options, args));
		
		// show help option
		if ( getCmd().hasOption("h") || args.length == 0) {
			show_help(options);
		}
	}


	/*
	 * getCmd - Getter
	 * @return String Returns string arguments for expression
	 */
	public String getExpression() {
		String expression = new String("");
		List<String> argList = getCmd().getArgList(); 
		for (int i=0;i<argList.size();i++) {
			// Options ?
			if (!argList.get(i).equals("-h")) {
				if (expression.equals("")) 
					expression = argList.get(i);
				else
					expression = expression + " " + argList.get(i);
			}
		}
		return expression ;
	}


}
