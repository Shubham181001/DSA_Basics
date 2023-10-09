package patterns_k;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern4(n);
	}
	
	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		int end = 2 * n - 1;
		
		for(int row2 = n + 1; row2 <= end; row2++) {
			for(int col2 = 1; col2 <= 2 * n - row2; col2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

