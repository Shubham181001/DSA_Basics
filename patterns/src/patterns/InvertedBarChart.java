package patterns;

import java.util.Scanner;

public class InvertedBarChart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int digit = (int)Math.log10(n) + 1;
		int max = Integer.MIN_VALUE;
		int temp = n;
		while(n != 0) {
			int rem = n % 10;
			if(max < rem) {
				max = rem;
			}
			n /= 10;
		}
		
		
		for(int row = 0; row < max; row++) {
			for(int col = digit; col >= 1; col--) {
				int prnt = temp / (int)Math.pow(10, col - 1);
				if(prnt != 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				int rem = (temp % (int)Math.pow(10, col - 1));
				
				temp = (prnt - 1) * (int)Math.pow(10, col - 1) + rem;
			}
			
			System.out.println();
		}
	}
}
