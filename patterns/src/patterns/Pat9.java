package patterns;

import java.util.Scanner;

public class Pat9 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int col = 1;
			while(col<=row)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
