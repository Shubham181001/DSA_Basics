package functions;

import java.util.Scanner;

public class Armstrong {
	public static int Remainder(int con,int rem)
	{
//		System.out.println("count "+con+" Remainder "+rem);
		int result = 1;
		for(int i=0;i<con;i++)
		{
			result = result*rem;
		}
		return result;
	}
	
	public static int Arm(int num)
	{
		int r,sum = 0, temp1,temp2,count;
		temp1 = num;
		count = 0;
		temp2 = num;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		System.out.println("count1:"+count);
		while(temp2>0)
		{
			r = temp2%10;
			int store = Remainder(count,r);
//			System.out.println(store);
			sum = sum + store;
			temp2 = temp2/10;
		}
		if(sum == temp1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the value of number that is to be checked that if it is an armstrong number or not:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int result = Arm(num);
		System.out.println("result:"+result);
	}

}
