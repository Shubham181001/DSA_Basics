package patterns;

import java.util.Scanner;

public class Pandey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++) {
			for(int spaces = 1; spaces <= row - 1; spaces++) {
				System.out.print("  ");
			}
			
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print(col + " ");
			}
			
			for(int col = n - row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
		
		for(int row = n - 1; row >= 1; row--) {
			for(int spaces = 1; spaces <= row - 1; spaces++) {
				System.out.print("  ");
			}
			
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print(col + " ");
			}
			
			for(int col = n - row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			
			System.out.println();
		}
	}
}
