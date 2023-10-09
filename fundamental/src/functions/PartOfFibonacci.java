package functions;

import java.util.Scanner;

public class PartOfFibonacci {
	
	public static boolean Fibonacci(int num)
	{
		int a = 0;
		int b = 1;
		int c;
		while(a<num)
		{
			c = a+b;
			a = b;
			b = c;
		}
		if(a==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the value of number that is to be checked that if it is the member of the fibonacci serires or not?:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		boolean result = Fibonacci(num);
		System.out.println("The given number "+num+" is a part of fibonacci series:"+result);
	}

}
