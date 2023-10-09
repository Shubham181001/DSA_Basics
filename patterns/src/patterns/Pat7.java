package patterns;

import java.util.Scanner;

public class Pat7 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		int dis = 1;
		while(row<=num)
		{
			int col = 1;
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
