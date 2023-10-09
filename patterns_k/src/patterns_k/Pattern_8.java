package patterns_k;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern8(n);
	}
	
	static void pattern8(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print("  ");
			}
			for(int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for(int col1 = 2; col1 <= row; col1++) {
				System.out.print(col1 + " ");
			}
			System.out.println();
		}
	}
}
