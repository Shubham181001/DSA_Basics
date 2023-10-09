package recursion_again;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = rev(n);
		System.out.println(ans);
	}
	
	static int rev(int num) {
		int digits = (int)Math.log10(num) + 1;
		return helper(num, digits);
	}
	
	static int helper(int num, int digits) {
		if(num % 10 == num) {
			return num;
		}
		
		int rem = num % 10;
		return rem * (int)(Math.pow(10, digits - 1)) + helper(num / 10, digits - 1);
	}
}
