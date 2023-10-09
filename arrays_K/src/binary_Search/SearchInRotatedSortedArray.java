package binary_Search;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		int res = search(arr, target);
		System.out.println(res);
	}
	
	static int search(int[] arr, int target) {
		int pivot = pivotIndexInRotatedSortedArr(arr);// Pivot is the largest element in the array
		int firstTry = binarySearch(arr, target, 0, pivot);
		if(firstTry != -1) {
			return firstTry;
		}
		return binarySearch(arr, target, pivot + 1, arr.length - 1);
	}
	
	static int pivotIndexInRotatedSortedArr(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if(arr[mid] <= arr[start]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		if(arr.length == 0) {
			return -1;
		}
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(target == arr[mid]) {
				return mid;
			}
			else if (target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
