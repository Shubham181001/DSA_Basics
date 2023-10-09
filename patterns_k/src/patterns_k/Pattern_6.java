package patterns_k;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		pattern6(n);
	}
	
	static void pattern6(int n) {
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print(" ");
			}
			
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int end = 2 * n - 1;
		for(int row1 = n + 1; row1 <= end; row1++) {
			for(int spaces = 1; spaces <= row1 - n; spaces++) {
				System.out.print(" ");
			}
			
			for(int col1 = 1; col1 <= 2 * n - row1; col1++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
