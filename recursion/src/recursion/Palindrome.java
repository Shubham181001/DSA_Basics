package recursion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = reverse(num);
		if(res == num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	
	static int reverse(int num) {
		int sum = 0;
		int rem = 0;
		while(num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
		return sum;
	}
}
