package conditions_And_Loops;

import java.util.Scanner;

public class Loops {
	
	public static void main(String[] args) {
		//Q: Print numbers from 1 to 5
		
//		int count = 1;
//		while(count<=5)
//		{
//			System.out.println(count);
//			count++;
//		}
		
//		for(int count = 1; count <= 5; count++)
//		{
//			System.out.println(count);
//		}
		
		//Print numbers from 1 to n
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		for(int i = 1; i <= num;i++)
//		{
////			System.out.println(i);
//			System.out.println("Hello World!");
//		}
		//1. It is preferable to use while loop when the programmer doesn't know that when that loop is going to end.
		//2. It is preferable to use for loop when the terminating condition is known to programmer.
		int n = 1;
		do {
			System.out.println("Hello World");
		}while(n != 1);
	}

}
