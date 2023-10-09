package fundamental;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		int sum=0,num,i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Till which number sum is expected:");
		num = s.nextInt();
		while(i<=num)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
