package StringFunctions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	/**
	 * @param arg
	 */
	public static void main(String arg[]) {

/*		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Regex");
		String regex = scanner.nextLine();
		System.out.println("Enter input String");
		String input = scanner.nextLine();*/
		
		//String regex = "\\s+";
		//String regex = ".*true.*";
		//String regex = "\\w+";
		String input = "_srigisiv@gmail.co";
/*		String regex= "^[A-Za-z0-9-_\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		*/
		String regex = "$";
		emailValidator(regex,input);
	}

	/**
	 * @param email
	 * @param input 
	 */
	public static void emailValidator(String regex, String input) { 
		System.out.println("Regex:" + regex + "   Input String: " + input);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		System.out.println("Matcher()" + m.matches());
		System.out.println(input.split("").length);
	    while (m.find()) {
	        System.out.print("Start index: " + m.start());
	        System.out.print(" End index: " + m.end() + " ");
	        System.out.println(m.group());
	      }
		
/*		
		String[] splits = input.split(regex);
		System.out.println("Match Result? " + input.matches(regex));
		
		System.out.println(splits.length);
		for (String string : splits) {
			System.out.println(string);
		}*/
			
	}
}
