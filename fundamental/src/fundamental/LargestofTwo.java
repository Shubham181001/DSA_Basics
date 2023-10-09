package fundamental;

import java.util.Scanner;

public class LargestofTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		System.out.print("Enter the first number:");
		num1 = s.nextInt();
		System.out.print("Enter the second number:");
		num2 = s.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else if(num1 == num2)
		{
			System.out.println(num1+" is equal to "+num2);
		}
		else
		{
			System.out.println(num2+" is greater than "+num1);
		}
	}

}
