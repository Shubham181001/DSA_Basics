package math_For_DSA;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// It denotes the number whose square root is to be calculated
		int precision = sc.nextInt();// It denotes the precision, till which point after decimal we want our square root of number to be calculated.
		System.out.printf("%.7f", sqrt(num, precision));
	}
	
	//Time: O(log(n))
	static double sqrt(int num, int precision) {
		int start = 0;
		int end = num;
		
		double root = 0.0;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if(mid * mid == num) {
				return mid;
			}
			else if(mid * mid > num) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		double incr = 0.1;
		for(int i = 0; i < precision; i++) {
			while(root * root <= num) {
				root += incr;
			}
			
			root -= incr;
			incr /= 10;
		}
		
		return root;
	}
}
