package functions;

import java.util.Scanner;

public class DivideNumbers {
	public static int divide(int num, int deno)
	{
		if(deno == 0)
		{
			return Integer.MIN_VALUE;
		}
		return num/deno;
	}
	
	public static void prntDivisionResult(int num, int deno)
	{
		if(deno == 0)
		{
			System.out.println("Division by zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}
	
	public static void main(String[] args) {
		int num, deno;
		System.out.print("Enter the value of numerator:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.print("Enter the value of denominator:");
		deno = s.nextInt();
//		int result = divide(num,deno);
//		System.out.println("The result of division is "+result);
		prntDivisionResult(num,deno);
	}

}
