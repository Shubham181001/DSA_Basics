package recursion;

import java.util.Scanner;

public class ProdOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = product(num);
		System.out.println(res);
	}
	
	static int product(int num) {
		if(num % 10 == num) {
			return num;
		}
		
		return (num % 10) * product(num / 10);
	}
}
