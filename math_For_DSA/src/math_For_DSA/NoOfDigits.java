package math_For_DSA;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 16; // This is telling the base 
		// if you want base of binary, set b to 2
		// if you want base of decimal, set b to 10
		// if you want base of octal, set b to 8
		// if you want base of hexadecimal, set b to 16
		
		int ans = (int)(Math.log(n) / Math.log(b)) + 1; // formula for finding the number of digits or bits in each and every base whether it is binary, decimal, hexadecimal or octal, it can also calculate the number of digits for some random base value.
		
		System.out.println(ans);
	}
}
