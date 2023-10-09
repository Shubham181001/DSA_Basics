package binary_Search;

public class FloorOfANumber {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		int target = 10;
		int ans = floor(arr, target);// floor number is a number which is greatest number smaller or equal to the target number. 
		System.out.println(ans);
	}

	 static int floor(int[] arr, int target) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		// but what if the target is smaller than the smallest number in the array
		
		if(target < arr[0]) {
			return Integer.MAX_VALUE;
		}
		
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return arr[mid];
			}
			else if(arr[mid] > target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		// Here loop gets violated i.e. the value of start becomes larger than end
		// so the end is start - 1
		// And end is that greatest element which is just smaller than target element
		return arr[end];
	}
}
