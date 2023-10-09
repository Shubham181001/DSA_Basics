package patterns_k;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern14(n);
	}
	
	static void pattern14(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= row - 1; spaces++) {
				System.out.print("  ");
			}
			if(row == 1 || row == n) {
				for(int col = 1; col <= n - row + 1; col++) {
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
				for(int space = 1; space <= n - (row + 1); space++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
