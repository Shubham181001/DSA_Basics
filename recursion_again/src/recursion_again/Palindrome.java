package recursion_again;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = palin(n);
		if(ans == n) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	
	static int palin(int num) {
		int digits = (int)Math.log10(num) + 1;
		return helper(num, digits);
	}
	
	static int helper(int num, int digits) {
		if(num % 10 == num) {
			return num;
		}
		
		int rem = num % 10;
		return rem * (int)Math.pow(10, digits - 1) + helper(num / 10, digits - 1);
	}
}
