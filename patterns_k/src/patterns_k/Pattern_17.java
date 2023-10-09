package patterns_k;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern17(n);
	}
	
	static void pattern17(int n) {
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print((char)('A' + row - 1));
			}
			System.out.println();
		}
	}
}
