package binary_Search;

import java.util.Arrays;

// first and last position of target element
public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
		int target = 8;
		int[] result = searchRange(arr, target);
		System.out.println(Arrays.toString(result));
	}
	
	static public int[] searchRange(int[] nums, int target) {
		int[] ans = {-1, -1};
		
		// check for start index first
		ans[0] = search(nums, target, true);
		if(ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}
		
		return ans;
	}
	
	// this function just returns the index value of target
	
	static int search(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				// potential answer found
				ans = mid;
				if(findStartIndex) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}
}
