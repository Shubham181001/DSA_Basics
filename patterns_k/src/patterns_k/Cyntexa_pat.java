package patterns_k;

import java.util.Scanner;

public class Cyntexa_pat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++) {
			char ch = 'A';
			for(int col = 1; col <= n - row + 1; col++) {
				if(col % 2 != 0) {
					System.out.print("*");
				}
				else {
					System.out.print(ch);
					ch++;
				}
			}
			
			for(int spaces = 1; spaces <= 2 * row - 1; spaces++) {
			  if(row == 1) {
				  System.out.print(ch);
			  }
			  else {
				  System.out.print(" ");
			  }
			}
			ch--;
			for(int col = 1; col <= n - row + 1; col++) {
				if(row % 2 != 0) {
					if(col % 2 != 0) {
						System.out.print("*");
					}
					else {
						System.out.print(ch);
						ch--;
					}
				}
				else {
					if(col % 2 == 0) {
						System.out.print("*");
					}
					else {
						System.out.print(ch);
						ch--;
					}
				}
			}
			
			System.out.println();
		}
		
		for(int row = n - 1; row >= 1; row--) {
			char ch = 'A';
			for(int col = 1; col <= n - row + 1; col++) {
				if(col % 2 != 0) {
					System.out.print("*");
				}
				else {
					System.out.print(ch);
					ch++;
				}
			}
			
			for(int spaces = 1; spaces <= 2 * row - 1; spaces++) {
			  if(row == 1) {
				  System.out.print(ch);
			  }
			  else {
				  System.out.print(" ");
			  }
			}
			ch--;
			for(int col = 1; col <= n - row + 1; col++) {
				if(row % 2 != 0) {
					if(col % 2 != 0) {
						System.out.print("*");
					}
					else {
						System.out.print(ch);
						ch--;
					}
				}
				else {
					if(col % 2 == 0) {
						System.out.print("*");
					}
					else {
						System.out.print(ch);
						ch--;
					}
				}
			}
			
			System.out.println();
		}
	}
}
