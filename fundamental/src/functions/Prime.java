package functions;

import java.util.Scanner;

public class Prime {
	public static boolean CheckPrime(int num)
	{
		int div = 2;
		boolean isPrime = true;
		while(div<=num/2)
		{
			if(num%div==0)
			{
				isPrime = false;
			}
			div++;
		}
		return isPrime;
	}
	
	public static boolean CheckPrime2(int num)
	{
		int div = 2;
		while(div<=num/2)
		{
			if(num%div==0)
			{
			  return false;
			}
			div++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the value of number that is to be checked for prime or not :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		boolean result = CheckPrime2(num);
		System.out.println("The given number "+num+" is prime?:"+result);
	}

}
