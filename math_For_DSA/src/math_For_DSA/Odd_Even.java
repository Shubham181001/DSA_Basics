package math_For_DSA;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res = isOdd(n);
		if(!res) {
			System.out.println("The number " + n +  " is an even number");
		}
		else {
			System.out.println("The number " + n + " is odd number");
			}
}
	
	static boolean isOdd(int n) {
		return (n & 1) == 1;
	}
}
