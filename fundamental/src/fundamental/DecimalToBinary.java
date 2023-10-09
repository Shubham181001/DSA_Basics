package fundamental;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//Decimal Number is taken as Input
//		String str = "";
		int sum = 0;
		while(n > 0) {
//			str += rem;
			sum = sum * 10 + n % 2;
			n /= 2;
		}
		
//		for(int i = str.length() - 1; i >= 0; i--) {
//			System.out.print(str.charAt(i));//Binary Number is Printed
//		}
		
		while(sum > 0) {
			System.out.print(sum % 10);
			sum /= 10;
		}
	}
}
