package math_For_DSA;

import java.util.Scanner;

public class Set_The_Ith_Bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// The number whose bit is to be set
		int i = sc.nextInt();// The bit which is to be set
	    int res = n | (1 << i - 1);
		System.out.println(res);
	}
}
