package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
		int col = 0;
		int[] arr = {4, 2, 2, 1};
		bubbleSort(arr, arr.length - 1, col);
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubbleSort(int[] arr, int row, int col) {
		if(row == 0) {
			return;
		}
		if(col < row) {
			if(arr[col] > arr[col + 1]) {
				// Swap
				int temp = arr[col];
				arr[col] = arr[col + 1];
				arr[col + 1] = temp;
			}
			
			 bubbleSort(arr, row, col + 1);
		}
		else {
		 bubbleSort(arr, row - 1, 0);
		}
	}
}
