package functions;

import java.util.Scanner;

public class Power {
	
	public static void Pow(int num, int expo)
	{
		int ans = 1;
		for(int i = 0; i<expo;i++)
		{
			ans*=num;
		}
		System.out.println("The desired result is: "+ans);
	}
	
	public static void main(String[] args) {
		int num,expo;
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Enter the exponent value:");
		expo = s.nextInt();
		Pow(num,expo);
	}

}
