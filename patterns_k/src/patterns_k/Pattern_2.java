package patterns_k;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int row = 1; row <= n; row++) {
//			for (int col = n - row + 1; col > 0 ; col--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		// This can be done like this also
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
