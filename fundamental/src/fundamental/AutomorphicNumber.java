package fundamental;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int square = n * n;
		int digits = (int)Math.log10(n) + 1;
		int last = square % (int)Math.pow(10, digits);
		
		if(last == n) {
			System.out.print("The number is an automorphic number");
		}
		else {
			System.out.println("The number is not an automorphic number");
		}
	}
}
