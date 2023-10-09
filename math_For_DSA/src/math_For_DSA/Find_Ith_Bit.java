package math_For_DSA;

import java.util.Scanner;

public class Find_Ith_Bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// The number whose ith bit is needed
		int i = sc.nextInt();// The bit which is required.
		int res = n & (1 << i - 1);
		System.out.println(res);
	}
}
