package fundamental;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int div = 2;
//		boolean isPrime = true;
//		while(div<=num/2)
//		{
//			if(num%div==0)
//			{
//				isPrime = false;
//			}
//			div++;
//		}
//		if(isPrime)
//		{
//			System.out.println(num+" is a Prime number");
//		}
//		else
//		{
//			System.out.print(num+" is a composite number");
//		}
		
		while(div<=num/2)
		{
			if(num%div==0)
			{
				System.out.println(num+" is a composite number");
				return; //NO FURTHER LINE WILL BE EXECUTING AFTER THIS LINE IN THE MAIN.
			}
			div++;
		}
		System.out.println(num+" is a prime number");
		
	}

}
