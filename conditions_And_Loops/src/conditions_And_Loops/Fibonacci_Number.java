package conditions_And_Loops;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		//Q: Find nth fibonacci number.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number whose respective fibonacci number has to be written:");
		int n = in.nextInt();
		int p = 0;
		int i = 1;
		int count = 1;
		
		while(count < n)
		{
			int temp = i;
			i = i + p;
			p = temp;
			count++;
		}
		
		System.out.println(i);
	}
}
