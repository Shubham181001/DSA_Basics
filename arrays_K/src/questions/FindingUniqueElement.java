package questions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FindingUniqueElement {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 6, 8, 4};
		int start = 0;
		int end = arr.length - 1;
		arr = sort(arr, start, end);
		System.out.println(Arrays.toString(arr));
		List<Integer> nums = new ArrayList<>();
		nums = binarySearch(arr, true);
		List<Integer> bin = new ArrayList<>();
		bin = binarySearch(arr, false);
		List<Integer> res = new ArrayList<>();
		res.addAll(nums);
		res.addAll(bin);
		System.out.println(nums);
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
	
	static List<Integer> binarySearch(int[] arr, boolean uniqueNumberInFirstHalf) {
		int start = 0;
		int end = arr.length - 1;
		List<Integer> nums = new ArrayList<>();

		while(start <= end) {
			int mid = start + (end - start) / 2;
			if((mid >=0 && mid < arr.length) && (arr[mid] == arr[mid + 1])) {
				if(uniqueNumberInFirstHalf) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
			else {
				nums.add(arr[mid]);
			}
		}
		return nums;
	}
}
