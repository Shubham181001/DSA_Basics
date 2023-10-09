package cyclicSort;

import java.util.List;
import java.util.ArrayList;

// Amazon and Microsoft Question
public class AllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> nums = findDuplicates(arr);
		System.out.println(nums);
	}
	
	 static List<Integer> findDuplicates(int[] nums){
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
		
		List<Integer> var = new ArrayList<>();
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] != (index + 1)) {
				var.add(nums[index]);
			}
		}
		return var;
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
