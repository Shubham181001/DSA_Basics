package fundamental;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		int k = sc.nextInt();
		int digit = (int)Math.log10(n) + 1;
		k = k % digit;
		if(k < 0) {
			k = k + digit;
		}
		long rotated = n % (int)Math.pow(10, k);
		for(int i = 1; i <= k; i++) {
			n /= 10;
		}
		rotated = rotated * (int)Math.pow(10, digit - k) + n;
		System.out.println(rotated);
	}
}
