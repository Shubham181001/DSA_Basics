package patterns_k;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
