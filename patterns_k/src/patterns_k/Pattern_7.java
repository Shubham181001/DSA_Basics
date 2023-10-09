package patterns_k;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern7(n);
	}
	
	static void pattern7(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col1 = 1; col1 <= row; col1++) {
				System.out.print("*");
			}
			for(int spaces = 1; spaces <= 2 * (n - row); spaces++) {
				System.out.print(" ");
			}
			for(int col2 = 1; col2 <= row; col2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row1 = n + 1; row1 <= 2 * n - 1; row1++) {
			for(int col_D1 = 1; col_D1 <= 2 * n - row1; col_D1++) {
				System.out.print("*");
			}
			for(int spaces1 = 1; spaces1 <= 2 * (row1 - 5); spaces1++) {
				System.out.print(" ");
			}
			for(int col_D2 = 1; col_D2 <= 2 * n - row1; col_D2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
