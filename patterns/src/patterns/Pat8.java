package patterns;

import java.util.Scanner;

public class Pat8 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the value of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int col = 1;
			int dis = row;
			while(col<=row)
			{
				System.out.print(dis);
				dis++;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
