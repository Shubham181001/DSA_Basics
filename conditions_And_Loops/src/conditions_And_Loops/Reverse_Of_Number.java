package conditions_And_Loops;

import java.util.Scanner;

public class Reverse_Of_Number {

	public static void main(String[] args) {
		//Q: Print the Reverse of a number.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = in.nextInt();
		int result = 0;
		while(num>0)
		{
			int rem = num % 10;
			result = result*10 + rem;
			num = num/10;
		}
		System.out.println(result);
	}
}
