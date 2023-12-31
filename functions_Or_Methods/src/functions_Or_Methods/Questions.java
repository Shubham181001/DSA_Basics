package functions_Or_Methods;

import java.util.Scanner;

public class Questions {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		System.out.println(n+" is "+"prime ? "+isPrime(n));
		for(int i = 100; i < 1000; i++) {
			if(isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	//Q: Print all the three digit Armstrong numbers
	static boolean isArmstrong(int n) {
		int original = n;
		int sum = 0;
		while(n > 0) {
			int rem = n % 10;
			n = n / 10;
			sum = sum + rem * rem * rem;
		}
		return sum == original;
	}
	
	//Q: Prime Number
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int c = 2;
		while(c * c <= n) {
			if(n % c == 0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}
}
