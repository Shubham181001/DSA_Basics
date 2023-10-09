package arrays_K;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array {

	public static void main(String[] args) {
		
//		int[][] arr = new int[3][];
//		//First bracket defines the size of the row 
//		//Second bracket defines the size of the column
//		//Providing row size is necessary but we can leave column size blank.
		
		Scanner in = new Scanner(System.in);
		
		int [][] arr = new int[3][2];
		System.out.println(arr.length);// only provides number of rows irrespective of columns
		
		for(int row = 0; row < arr.length; row++) {
			//for each col in every row
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();
			}
		}
		
//		for(int row = 0; row < arr.length; row++) {
//			//for each col in every row
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		// Enhanced version of traversing and printing the 2D array
		for (int[] a : arr )
		System.out.println(Arrays.toString(a));
		
	}
}
