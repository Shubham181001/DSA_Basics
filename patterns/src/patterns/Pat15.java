package patterns;

import java.util.Scanner;

public class Pat15 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int col = 1;
			char dis = (char)('A'+row-1);
			while(col<=row)
			{
				char prnt = (char)(dis+col-1);
				System.out.print(prnt);
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
