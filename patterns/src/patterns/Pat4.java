package patterns;

import java.util.Scanner;

public class Pat4 {
	public static void main(String[] args) {
		int row = 1;
		int num;
		System.out.println("Enter the number of rows:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		while(row<=num)
		{
//			int col = num;
//			while(col>=1)
//			{
//				System.out.print(col);
//				col--;
//			}
			
			int col = 1;
			while(col<=num)
			{
				System.out.print(num-col+1);
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
