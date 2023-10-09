package math_For_DSA;

import java.util.Scanner;

public class Reset_The_Ith_BIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();
		int res = n & (~(1<< i - 1));
		System.out.println(res);
	}
}
