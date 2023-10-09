package arrays_K;

import java.util.Arrays;

public class ColNoFixed {

	public static void main(String[] args) {
		int [] [] arr = {
				{1, 2, 3, 4},
				{5, 6},
				{7, 8, 9}
		};
		for(int [] row : arr)
		{
			System.out.println(Arrays.toString(row));
		}
		// Simple version of the above code can be written as well
		for(int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
}
