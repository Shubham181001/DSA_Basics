package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{23, 4, 1},
				{18, 12, 3, 9},
				{78, 99, 34, 56},
				{18, 12}
		};
		
		int target = 56;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		int result = max(arr);
		System.out.println(result);
	}

	 static int[] search(int[][] arr, int target) {
		 
		if(arr.length == 0) {
			return new int[] {-1, -1};
		}
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
			   int element = arr[row][col];
			   if(element == target) {
				   return new int[] {row, col};
			   }
			}
		}
		
		return new int[] {-1, -1};
	}
	 
	 static int max(int[][] arr) {
		 
			if(arr.length == 0) {
				return -1;
			}
			
			 int max = arr[0][0];
			for(int row = 0; row < arr.length; row++) {
				for(int col = 0; col < arr[row].length; col++) {
				   if(arr[row][col] > max) {
					   max = arr[row][col];
				   }
				}
			}
			
			return max;
		}
}
