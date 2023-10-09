package questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindingUniqueElement1 {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 6, 8, 4};
	    int start = 0;
	    int end = arr.length - 1;
		arr = sort(arr, start, end);
		System.out.println(Arrays.toString(arr));
		List<Integer> nums = new ArrayList<>();
		nums = unique(arr);
		System.out.println(nums);
	}
	
	static List<Integer> unique(int[] arr){
		int start = 0;
		int end = arr.length - 1;
		List<Integer> nums = new ArrayList<>();
		while(start <= end)
		{
			if(arr[start] == arr[start + 1]) {
				start++;
			}
			else {
				nums.add(arr[start]);
				start++;
			}
			
			
			if(arr[end] == arr[end - 1]) {
				end--;
			}
			else {
				nums.add(arr[end]);
				end--;
			}
		}
		return nums;
	}
	
	static int[] sort(int[] arr, int start, int end) {
		if(start < end) {
			int pi = partition(arr, start, end);
			
			sort(arr, start, pi - 1);
			sort(arr, pi + 1, end);
		}
		return arr;
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = (start - 1);
		for(int j = start; j < end; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		
		return i + 1;
	}
	
}
