package patterns_k;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern10(n);
	}
	
	static void pattern10(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			for(int spaces = 0; spaces < 2 * (row - 1); spaces++) {
				System.out.print("  ");
			}
			for(int col1 = 1; col1 <= n - row + 1; col1++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int row1 = n + 1; row1 <= 2 * n - 1; row1++) {
			for(int col2 = 1; col2 <= row1 - 4; col2++) {
				System.out.print("* ");
			}
			for(int spaces1 = 1; spaces1 <= 3 * (n + 1) - 2 * row1; spaces1++) {
				System.out.print("  ");
			}
			for(int col3 = 1; col3 <= row1 - 4; col3++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
