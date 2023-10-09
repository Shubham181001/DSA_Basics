package functions_Or_Methods;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		//Q: Take input of 2 numbers and print the sum 
//		Scanner in = new Scanner(System.in);
//		int num1,num2,sum;
//		
//		System.out.print("Enter number 1:");
//		 num1 = in.nextInt();
//		 
//		System.out.print("Enter number 2:");
//		 num2 = in.nextInt();
//		
//		 sum = num1 + num2;
//		System.out.println("The sum = "+ sum);
		
//		int ans = sum2();
//		System.out.println(ans);
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter number 1:");
		int num1 = in.nextInt();
		System.out.println("Please Enter number 2:");
		int num2 = in.nextInt();
		int ans = sum3(num1,num2);
		System.out.println(ans);
	}
	
	public static void sum() {
		Scanner in = new Scanner(System.in);
		int num1,num2,sum;
		
		System.out.print("Enter number 1:");
		 num1 = in.nextInt();
		 
		System.out.print("Enter number 2:");
		 num2 = in.nextInt();
		
		 sum = num1 + num2;
		System.out.println("The sum = "+ sum);
	}
	
	static int sum2()
	{
		Scanner in = new Scanner(System.in);
		int num1,num2,sum;
		
		System.out.print("Enter number 1:");
		 num1 = in.nextInt();
		 
		System.out.print("Enter number 2:");
		 num2 = in.nextInt();
		
		 sum = num1 + num2;
		 return sum;
//		 System.out.println("This will never execute");Unreachable Statement
	}
	
	//pass the value of numbers when you are calling the method in main()
	static int sum3(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
