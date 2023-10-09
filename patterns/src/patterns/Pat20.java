package patterns;

import java.util.Scanner;

public class Pat20 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int col = 1;
			int p = num-row+1;
			while(col<=p)
			{
				System.out.print(p);
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
