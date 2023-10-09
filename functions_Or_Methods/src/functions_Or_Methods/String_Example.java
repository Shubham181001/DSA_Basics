package functions_Or_Methods;

import java.util.Scanner;

public class String_Example {

	static String greet() {
		String greeting = "how are you?";
		return greeting;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter your name:");
		String name = in.next();
		String personalisedMessage = myGreet(name);
		System.out.println(personalisedMessage);
	}

	 static String myGreet(String name) {
		String message = "Hello " + name;
		return message;
	}
}
