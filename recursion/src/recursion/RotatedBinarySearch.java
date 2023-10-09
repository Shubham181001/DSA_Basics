package recursion;

import java.util.Scanner;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
		int target = sc.nextInt();
		int start = 0;
		int end = arr.length - 1;
		int res = RBS(arr, target, start, end);
		System.out.println(res);
	}
	
	static int RBS(int[] arr, int target, int start, int end) {
		if(start > end) {
			return - 1;
		}
		
		int mid = start + (end - start) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(arr[start] <= arr[mid]) {
			if(target >= arr[start] && target <= arr[mid]) {
				return RBS(arr, target, start, mid - 1);
			}
			else {
				return RBS(arr, target, mid + 1, end);
			}
		}
		
		if(target >= arr[mid] && target <= arr[end]) {
			return RBS(arr, target, mid + 1, end);
		}
		return RBS(arr, target, start, mid - 1);
	}
}
