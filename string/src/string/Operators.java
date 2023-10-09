package string;

import java.util.ArrayList;

public class Operators {

	public static void main(String[] args) {
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println((char)('a'+3));
		
		System.out.println("a" + 1);//When an integer is concatenated with string it is done with its wrapper class.
		// this is same as after a few steps: "a" + "1"
		// Here 1 is an integer and that will be converted to Integer(Wrapper Class) and that will call toString().
		
		System.out.println("Shubham" + new ArrayList<>());
		
		System.out.println("a" + 'b');
	}
}
