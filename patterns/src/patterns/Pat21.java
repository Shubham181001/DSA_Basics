package patterns;

import java.util.Scanner;

public class Pat21 {
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
			int inc = 1;
			while(inc<=row)
			{
				System.out.print(inc);
				inc++;
			}
			int dec = row-1;
			while(dec>=1)
			{
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			row++;
		}
	}

}
