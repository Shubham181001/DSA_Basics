package fundamental;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a,b,c,i,n;
		System.out.println("Enter the value of n:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		a =1;
		b = 1;
		for(i = 1;i<n;i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println("The nth term of fibonacci number is:"+a);
	}

}
