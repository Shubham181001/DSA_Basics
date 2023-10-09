package math_For_DSA;

import java.util.Scanner;

public class No_Of_Set_Bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		int count = 0;
		while(num > 0) {
			count++;
			 num = (num & (num - 1));
		}
		System.out.println(count);
	}
}
