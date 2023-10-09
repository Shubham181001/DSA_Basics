package recursion;

public class Simple_Recursion {

	public static void main(String[] args) {
		// write a function that prints the hello world
//		for(int i = 1; i <= 5; i++)
			message();
	}
	
	static void message() {
		System.out.println("Hello World");
		message1();
	}
	
	static void message1() {
		System.out.println("Hello World");
		message2();
	}
	
	static void message2() {
		System.out.println("Hello World");
		message3();
	}
	
	static void message3() {
		System.out.println("Hello World");
		message4();
	}
	
	static void message4() {
		System.out.println("Hello World");
	}
}
