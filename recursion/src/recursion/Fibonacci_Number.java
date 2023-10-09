package recursion;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = print_Fibonacci(n);
		System.out.println(res);
	}
	
	static int print_Fibonacci(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		return (print_Fibonacci(n - 1) + print_Fibonacci(n - 2));
	}
}
