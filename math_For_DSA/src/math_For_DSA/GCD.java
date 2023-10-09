package math_For_DSA;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = gcd(num1, num2);
		System.out.println(res);
		int res1 = lcm(num1, num2);
		System.out.println(res1);
	}
	
	static int gcd(int num1, int num2) {
		if(num1 == 0) {
			return num2;
		}
		return gcd(num2 % num1, num1);
	}
	
	static int lcm(int num1, int num2) {
		return (num1 * num2) / gcd(num1, num2);
	}
}
