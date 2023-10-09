package cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Google Question
public class DisappearedNumbers {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> nums = sort(arr);
		System.out.println(nums);
	}
	
	static List<Integer> sort(int[] arr) {
		int start = 0;
		while(start < arr.length) {
			int correct = arr[start] - 1;
			if(arr[start] != arr[correct]) {
				swap(arr, start, correct);
			}
			else {
				start++;
			}
		}
		
		// just find missing number.
		
		List<Integer> ans = new ArrayList<>();
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] != index + 1){
				ans.add(index + 1);
			}
		}
		
		return ans;
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
