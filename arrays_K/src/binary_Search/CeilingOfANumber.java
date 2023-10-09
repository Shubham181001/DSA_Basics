package binary_Search;

public class CeilingOfANumber {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 10;
		int ans = ceiling(arr, target);// Ceiling number is a number that is smallest value in the array that is larger than target value or equal to the target element
		System.out.println(ans);
	}

	 static int ceiling(int[] arr, int target) {
		if(arr.length == 0) {
			return -1;
		}
		// but what if the target is greater than the greatest element in the array
		
		if(target > arr[arr.length - 1]) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return arr[mid + 1];
			}
			else if(arr[mid] > target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return arr[start];
	}
}
