package patterns;

import java.util.Scanner;

public class Govind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++) {
			int temp = row;
			for(int col = 1; col <= row; col++) {
				System.out.print(temp + " ");
				temp--;
			}
			
			for(int spaces = 1; spaces <= ((n - row) * 2) - 1; spaces++) {
				System.out.print("  ");
			}
			
			if(row < n) {
				for(int col = 1; col <= row; col++) {
					System.out.print(col + " ");
				}
			}
			else {
				for(int col = 2; col <= row; col++) {
					System.out.print(col + " ");
				}
			}
			
			System.out.println();
		}
		
		for(int row = n - 1; row >= 1; row--) {
			int temp = row;
			for(int col = 1; col <= row; col++) {
				System.out.print(temp + " ");
				temp--;
			}
			
			for(int spaces = 1; spaces <= ((n - row) * 2) - 1; spaces++) {
				System.out.print("  ");
			}
			
			if(row < n) {
				for(int col = 1; col <= row; col++) {
					System.out.print(col + " ");
				}
			}
			else {
				for(int col = 2; col <= row; col++) {
					System.out.print(col + " ");
				}
			}
			
			System.out.println();
		}
	}
}
