package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {4, 3, 2, 8, 1};
		int max = 0;
		selectionSort(arr, max, arr.length, 0);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr, int max, int row, int col) {
		if(row == 0) {
			return;
		}
		
		if(col < row) {
			if(arr[col] > arr[max]) {
				selectionSort(arr, col, row, col + 1);
			}
			else {
				selectionSort(arr, max, row, col + 1);
			}
		}
		else {
			int temp = arr[max];
			arr[max] = arr[row - 1];
			arr[row - 1] = temp;
			selectionSort(arr, 0, row - 1, 0);
		}
	}
}
