package patterns_k;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern13(n);
	}
	
	static void pattern13(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= row - 1; spaces++) {
				System.out.print(" ");
			}
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print(col);
			}
			for(int col1 = n - row; col1 >= 1; col1--) {
				System.out.print(col1);
			}
			System.out.println();
		}
	}
}
