package functions;

import java.util.Scanner;

public class EvenNumbers1 {
	
	public static void Even(int start, int end)
	{
		if(start%2!=0)
		{
			start++;
		}
		for(int i = start; i<=end;i+=2)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int s1,e;
		System.out.println("Enter the start value:");
		Scanner s = new Scanner(System.in);
		s1 = s.nextInt();
		System.out.println("Enter the end value:");
		e = s.nextInt();
		Even(s1,e);
	}

}
