import org.apache.commons.cli.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private String add; 
	
	public Main() { }
	public Main(Options options, String args[]) {
		CommandLineParser parser = new DefaultParser();
		try {
        // parse the command line arguments
																																																																																																						CommandLine line = parser.parse(options, args);
			if (line.hasOption("add")) {
			// initialise the member variable
				this.add = line.getOptionValue("add");
			}
			if (line.hasOption("readLine")) {
			// 
				System.out.println("Escreva uma linha");
				Scanner scanner = new Scanner(System.in);
				System.out.println(scanner.nextLine());
			}
			if (line.hasOption("readWord")) {
			// 
				System.out.println("Escreva uma palavra");
				Scanner scanner = new Scanner(System.in);
				System.out.println(scanner.next());
			}
			if (line.hasOption("help")) {
			// Generate Help
				HelpFormatter formatter = new HelpFormatter();
				formatter.printHelp("Main", options);
			}
		}
		catch (ParseException exp) {
			System.err.println("Parsing failed.  Reason: " + exp.getMessage());
		}
		
		//
		System.out.println(add);
	}
	
	public static void main(String args[]){
		System.out.println(args);
		System.out.println(args.toString());
		System.out.println(Arrays.toString(args));
		
		Options options = new Options();
		options.addOption("add", true, "valor a ser adicionado");
		options.addOption("readLine", false, "le um texto");
		options.addOption("readWord", false, "le um texto");
		options.addOption("help", false, "Parementro de tempo");
		
		
		Main m = new Main(options, args);
	}
}
