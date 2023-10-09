package functions;

import java.util.Scanner;

public class EvenNumbers {
	
	public static void printEvenOddNumbers(int num)
	{
		int i;
		for(i = 1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is an even number");
			}
			else
			{
				System.out.println(i+" is an odd number");
			}
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		printEvenOddNumbers(n);
	}

}
