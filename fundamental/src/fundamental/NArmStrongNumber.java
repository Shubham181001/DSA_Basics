package fundamental;

import java.util.Scanner;

public class NArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int count = 1;
		while(true) {
			if(count <= n) {
				int digits = digit(i);
				int sum = sum(i, digits);
				if(sum == i) {
					System.out.print(i + " ");
					count++;
				}
				i++;
			}
			else {
				break;
			}
		}
	}
	
	static int digit(int n) {
	    int count = 0;
	    while(n > 0) {
	    	n /= 10;
	    	count++;
	    }
	    return count;
	}
	
	static int sum(int n, int digit) {
		int sum = 0;
		int rem = 0;
		while(n > 0) {
			rem = n % 10;
			sum = sum + power(rem, digit);
			n /= 10;
		}
		return sum;
	}
	
	static int power(int x, int digit) {
		int sum = 1;
		for(int i = 1; i <= digit; i++) {
			sum *= x;
		}
		return sum;
	}
}
