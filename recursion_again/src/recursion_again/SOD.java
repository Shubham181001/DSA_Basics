package recursion_again;

import java.util.Scanner;

public class SOD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(sumOfDigits(n));
	}
	
	static int sumOfDigits(int n) {
		if(n % 10 == n) {
			return n;
		}
		return n % 10 + sumOfDigits(n / 10);
	}
}
