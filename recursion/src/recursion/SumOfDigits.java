package recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = sumOfD(num);
		System.out.println(res);
	}
	
	static int sumOfD(int num) {
		if(num == 0) {
			return 0;
		}
		
		return sumOfD(num / 10) + num % 10;
	}
}
