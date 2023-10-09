package patterns_k;

import java.util.Scanner;

public class Cyntexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char ch_Start = 'A';
		char temp = 'A';
		for(int row = 1; row <= n; row++) {
			if(row == 1) {
				System.out.println("1");
			}
			
			else if(row > 1 && row < n) {
				for(int spaces = 1; spaces <= row - 1; spaces++) {
					if(spaces == 1) {
						System.out.print("  ");
					}
					
					else {
						System.out.print(temp + " ");
						temp --;
					}
				}
				char ch_End = 'Z';
				for(int col = row; col <= n - 1; col++) {
					if(col == row) {
						System.out.print(row + " ");
					}
					else {
						if(row <= n - 2) {
							System.out.print(ch_End + " ");
							ch_End--;
						}
					}
				}
				System.out.println();
				if(row >= 3) {
					ch_Start++;
					temp = ch_Start;
				}
			}
			else {
				for(int spaces = 1; spaces <= row - 1; spaces++) {
					System.out.print("  ");
				}
				System.out.print(n);
			}
		}
	}
}
