package arrays_K;

import java.util.Scanner;
public class IndexOfLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {4, 2, 10, 1, 13};
		int index = maxIndex(arr);
		System.out.println(index);
	}
	
	static int maxIndex(int[] arr) {
		if(arr.length == 0) {
			return Integer.MIN_VALUE; 
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		int res = 0;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(max == arr[i]) {
				res = i;
			}
		}
		return res;
	}
}
