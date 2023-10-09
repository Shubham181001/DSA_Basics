package patterns_k;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern15(n);
	}
	
	static void pattern15(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			for(int spaces = 1; spaces <= 2 * (n - row); spaces++) {
				System.out.print("  ");
			}
			for(int col1 = row; col1 >= 1; col1--) {
				System.out.print(col1 + " ");
			}
			System.out.println();
		}
	}
}
