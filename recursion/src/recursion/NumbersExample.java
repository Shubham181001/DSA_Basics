package recursion;

public class NumbersExample {

	public static void main(String[] args) {
		// write a function that takes in a number and prints it.
		// Print first 5 numbers : 1 2 3 4 5
		
		print(1);
	}
	
	static void print(int n) {
		if(n > 5)
			return;
		System.out.println(n);
		
		// recursive call
		// if you are calling a function again and again, you can treat it as a separate call in the stack
		
		// this is the last function call
		// It is known as tail recursion
		print(n + 1);
	}
}
