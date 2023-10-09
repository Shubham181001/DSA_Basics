package recursion;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = printReverse2(num);
//		System.out.println(res);
		if(res == num) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	
	//Iterative Process
	static void printReverse(int num) {
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(num > 0) {
		 rem = num % 10;
		 sum = sum * 10 + rem;
		 num /= 10;
		}
		System.out.println(sum);
	}
	
	//Recursive Process
	static int printReverse2(int num) {
		int digits = (int)(Math.log10(num)) + 1;
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
