package conditions_And_Loops;

import java.util.Scanner;

public class Repetitive_Number {

	public static void main(String[] args) {
		//Q: Find the specific digit that how many times it occured in that number.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = in.nextInt();
		System.out.println("Please enter the number whose repetition has to be counted:");
		int num1 = in.nextInt();
		
		int count = 0;
		while(num > 0)
		{
			int rem = num % 10;
			if(rem == num1)
			{
				count++;
			}
			num = num/10;
		}
		System.out.println(count);
	}
}
