package patterns;

import java.util.Scanner;

public class Pat12 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.print("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
			int col = 1;
			while(col<=num)
			{
				char dis = (char)('A'+col-1);
				System.out.print(dis);
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
