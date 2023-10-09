package patterns;

import java.util.Scanner;

public class Pat22 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.print("Enter the number of rows:");
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
			int incstars = 1;
			while(incstars<=row)
			{
				System.out.print("*");
				incstars++;
			}
			int decstars = row-1;
			while(decstars>=1)
			{
				System.out.print("*");
				decstars--;
			}
			System.out.println();
			row++;
		}
	}

}
