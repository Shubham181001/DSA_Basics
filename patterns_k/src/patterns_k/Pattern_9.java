package patterns_k;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern9(n);
	}
	
	static void pattern9(int n) {
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
		
		for(int row1 = n + 1; row1 <= 2 * n - 1; row1++) {
			for(int spaces1 = 1; spaces1 <= row1 - n; spaces1++) {
				System.out.print("  ");
			}
			for(int col3 = 2 * n - row1; col3 >= 1; col3--) {
				System.out.print(col3 + " ");
			}
			for(int col4 = 2; col4 <= 2 * n - row1; col4++) {
				System.out.print(col4 + " ");
			}
			System.out.println();
		}
	}
}
