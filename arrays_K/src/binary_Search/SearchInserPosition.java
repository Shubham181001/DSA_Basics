package binary_Search;

public class SearchInserPosition {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6};
		int target = 5;
		int res = searchInsert(arr, target);
		System.out.println(res);
	}
	
	static int searchInsert(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
}
