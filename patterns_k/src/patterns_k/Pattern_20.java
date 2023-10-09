package patterns_k;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern20(n);
	}
	
	static void pattern20(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row = n - 1; row >= 1; row--) {
			for(int spaces = n - row; spaces >= 1; spaces--) {
				System.out.print("  ");
			}
			for(int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
