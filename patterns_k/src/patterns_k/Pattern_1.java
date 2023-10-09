package patterns_k;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row = 1; row <= n; row++) {
			// for every row, run the col
			for(int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// when one row is printed, we need to add a new line
			System.out.println();
		}
	}
}
