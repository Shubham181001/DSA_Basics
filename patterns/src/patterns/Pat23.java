package patterns;

import java.util.Scanner;

public class Pat23 {
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
			int incnum = row;
			int col = 1;
			while(col<=row)
			{
				System.out.print(incnum+col-1);
				col++;
			}
      		int decnum = 2*row-2;
      		while(decnum>=row)
      		{
      			System.out.print(decnum);
      			decnum--;
      		}
			System.out.println();
			row++;
		}
	}

}
