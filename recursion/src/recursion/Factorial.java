package recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = fact(num);
		System.out.println(res);
	}
	
	static int fact(int num) {
		if(num <= 1) {
			return 1;
		}
		
		return num * fact(num - 1);
	}
}
