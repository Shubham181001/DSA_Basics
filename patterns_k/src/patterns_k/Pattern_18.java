package patterns_k;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		pattern18(n);
	}
	
	static void pattern18(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print("  ");
			}
			for(int col = 1; col <= row; col++) {
				System.out.print((char)('A' + col - 1) + " ");
			}
			for(int col1 = row - 1; col1 >= 1; col1--) {
				System.out.print((char)('A' + col1 - 1) + " ");
			}
			System.out.println();
		}
	}
}
