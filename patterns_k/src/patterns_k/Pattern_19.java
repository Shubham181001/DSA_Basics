package patterns_k;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern19(n);
	}
	
	static void pattern19(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = row; col >= 1; col--) {
				System.out.print((char)('A' + n - col) + " ");
			}
			System.out.println();
		}
	}
}
