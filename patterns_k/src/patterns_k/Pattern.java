package patterns_k;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= n - row; spaces++) {
				System.out.print(" ");
			}
			
			if(row == 1) {
				System.out.println("*");
			}
			
			else {
				System.out.print("*");
				for(int spaces = 1; spaces <= 2 * row - 3; spaces++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}
