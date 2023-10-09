package patterns;

import java.util.Scanner;

public class Pat18 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int spaces = 1;
			while(spaces<=num-row)
			{
				System.out.print(" ");
				spaces++;
			}
			int stars = 1;
			while(stars<=row)
			{
				System.out.print("*");
				stars++;
			}
			System.out.println();
			row++;
		}
	}

}
