package patterns_k;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern5(n);
	}
	
	static void pattern5(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
