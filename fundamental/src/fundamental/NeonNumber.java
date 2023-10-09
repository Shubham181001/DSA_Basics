package fundamental;

import java.util.Scanner;

public class NeonNumber {

	// A Number whose sum of digits of square is also equal to the number itself is known a Neon Number.
	// Just look at the number 9 
	// Square of 9 is 81 
	// And the sum of the digits of square is 8 + 1 = 9 that is also equal to the number itself.
	// So it is a Neon Number.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int square = n * n;
		int sum = 0;
		int rem = 0;
		
		// The interesting fact is that other than 1 and 9 there doesn't exist any number which is a Neon number.
		while(square > 0) {
			rem = square % 10;
			sum = sum + rem;
			square /= 10;
		}
		
		if(sum == n) {
			System.out.println("The given number is a Neon Number");
		}
		else {
			System.out.println("The given number is not a Neon Number");
		}
	}
}
