package math_For_DSA;

import java.util.Scanner;

// Amazon Question
public class Magic_Number {

	// Magic number means multiplying the bits with 5 and adding them
	// for example if we have to find the 5th magic number, then
	// Binary value of 5 would be 101, so the least significant bit is 1
	// multiply it with 5
	// 2nd bit is 0 multiply it with 5 * 5 and add the previous result 
	// i.e. it would be 0 + 5 = 5
	// and for the last and most significant bit multiply it with 5 * 5 * 5 and add the previous result
	// so the result would be 5 + 125 = 130
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int base = 5;
		
		while (n > 0) {
			int lastDigit = n & 1;
			System.out.println(lastDigit);
			n = n >> 1;
			ans += lastDigit * base;
			base = base * 5;
		}
		
		System.out.println(ans);
		
	}
}
