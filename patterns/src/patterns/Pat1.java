package patterns;

import java.util.Arrays;
import java.util.Scanner;

public class Pat1 {
	public static void main(String[] args) {
//		int row = 1;
//		int num;
//		System.out.println("Enter the number of rows:");
//		Scanner s = new Scanner(System.in);
//		num = s.nextInt();
//		while(row<=num)
//		{
//			int col = 1;
//			while(col<=num)
//			{
//				System.out.print("*");
//				col++;
//			}
//			System.out.print("\n");
//			row++;
//		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = (int)Math.log10(num) + 1;
		int[] arr = new int[digit];
		int duplicate = num;
		
		for(int itr = 0; itr < digit; itr++) {
			arr[itr] = duplicate / (int)Math.pow(10, digit-itr-1);
			duplicate = duplicate % (int)Math.pow(10, digit-itr-1);
		}
		int max = Integer.MIN_VALUE;
		
		while(num != 0) {
			int rem = num % 10;
			if(rem >= max) {
				max = rem;
			}
			num /= 10;
		}
		
		for(int row = 0; row < max; row++) {
			for(int col = 0; col < digit; col++) {
				if(arr[col] != 0) {
					System.out.print("* ");
					arr[col] = arr[col] - 1;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
