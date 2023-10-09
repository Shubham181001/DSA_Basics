package fundamental;

import java.util.Scanner;

public class Primitives {
	public static void main(String[] args) {
//		int rollno = 64;//Size of Integer is 4 bytes
//		char letter = 'r';//Size of character is 2 bytes 
//		float marks  = 98.67f;//Size of float is 4 bytes 
//		double largeDecimalNumbers = 4567543.4567;//Size of double is 8 bytes.
//		long largeInteger = 354656657;//Size of long is 8 bytes.
//		boolean check = true;//It only stores two values either true or false.
//		//String is not primitive. Because Primitive means that datatype that cannot be broken further.
//		String name = "Shubham"; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your rollno.:");
		int rollno = input.nextInt();
		System.out.println("Your roll no is:"+rollno);
		int a = 10;//Here 10 is literal and a(variable) is identifier. In fact, every name in java is called identifier.
		int b = 234_000_000;//Underscore is simply ignored by the compiler.
		System.out.println(b);
		System.out.println("Please Enter your name:");
		String name = input.next();
		System.out.println("Hello! "+name);
	}

}
