package fundamental;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					res += j;
				}
			}
			
			if(res == i) {
				System.out.print(i + " ");
			}
			res = 0;
		}
	}
}
