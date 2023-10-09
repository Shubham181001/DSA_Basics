package cyclicSort;

import java.util.Arrays;

// Amazon question
public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 2};
		int res = findDuplicate(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(res);
	}
	
	static int findDuplicate(int[] nums) {
		int start = 0;
		while(start < nums.length) {
			int correct = nums[start] - 1;
			if(nums[start] != nums[correct]) {
				swap(nums, start, correct);
			}
			else {
				start++;
			}
		}
		
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] != (index + 1)) {
				return nums[index];
			}
		}
		return - 1;
	}
	
	static void swap(int[] arr, int start, int end) {
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
	}
}
