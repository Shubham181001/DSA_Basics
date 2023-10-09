package patterns_k;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern21(n);
	}
	
	static void pattern21(int n) {
		for(int row = 1; row <= n; row++) {
			int bin = 1;
			for(int col = 1; col <= row; col++) {
				if((row & 1) == 0) {
					bin = 1 - bin;
					System.out.print(bin + " ");
				}
				else {
					System.out.print(bin + " ");
					bin = 1 - bin;
				}
			}
			System.out.println();
		}
	}
}
