package functions_Or_Methods;

import java.util.Scanner;

public class Swap {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = a;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter number 1:");
		int num1  = in.nextInt();
		System.out.println("Please Enter number 2:");
		int num2 = in.nextInt();
		swap(num1, num2);
		System.out.println(num1 + " " + num2);
	}
}
