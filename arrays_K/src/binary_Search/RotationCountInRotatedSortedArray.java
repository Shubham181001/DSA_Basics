package binary_Search;

public class RotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 7, 7, 9, 0, 1};
		int count = rotationCount(arr);
		System.out.println("No. of times the array is being rotated : " + count);
	}
	
	static int rotationCount(int[] arr) {
		int pivot = findPivot(arr);
		return pivot + 1;
	}
	
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if(arr[mid] == arr[start] && arr[end] == arr[start]) {
				if(arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
				
				if(arr[end]>arr[end - 1]) {
					return end;
				}
				end--;
			}
				else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
					start = mid + 1;
				}
				else {
					end = mid - 1;
				}
			}
		return -1;
		}
		
}

