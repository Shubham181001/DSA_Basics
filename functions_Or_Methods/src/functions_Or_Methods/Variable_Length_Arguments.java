package functions_Or_Methods;

import java.util.Arrays;

public class Variable_Length_Arguments {

	public static void main(String[] args) {
		fun(2,3,4,5,56,87,3,23,45,65);
		multiple(4, 7, "Shubham", "Nikhil", "Rahul");
	}

	 static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	 
	static void multiple(int a, int b, String ...v) {//It is a mixture of variable length and fixed arguments
		System.out.println();
	}
}
