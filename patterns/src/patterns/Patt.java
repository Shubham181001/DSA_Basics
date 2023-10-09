package patterns;

import java.util.Scanner;

public class Patt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row = 1; row <= n; row++) {
			int count = 1;
			for(int col = 1; col <= n - row; col++) {
				System.out.print(count);
				count++;
			}
			
			for(int stars = 1; stars <= 2 * row - 1; stars++) {
				System.out.print("*");
				count++;
			}
			
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print(count);
				count++;
			}
			
			System.out.println();
		}
	}
}
