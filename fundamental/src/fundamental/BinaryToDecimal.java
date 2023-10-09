package fundamental;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// Take Binary Number as Input
		int rem = 0;
		int DecimalNum = 0;
		int position = 0;
		while (n > 0) {
			rem = n % 10;
			DecimalNum += (int)Math.pow(2, position) * rem;
			position++;
			n /= 10;
		}
		
		System.out.print(DecimalNum);
	}
}
