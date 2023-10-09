package recursion_again;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = fibonacci(n);
		if(ans < 0) {
			System.out.println("Negative numbers are not allowed");
		}
		else
			System.out.print(ans);
	}
	
	static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
