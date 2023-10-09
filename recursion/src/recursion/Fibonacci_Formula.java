package recursion;

import java.util.Scanner;

public class Fibonacci_Formula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			long res = fibo_Formula(i);
			System.out.println(res);
		}
		
		
	}
	
	
	static long fibo_Formula(int n) {
		return (long)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1- Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
	}
}
