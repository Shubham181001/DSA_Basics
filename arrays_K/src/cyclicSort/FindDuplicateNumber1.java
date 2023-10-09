package cyclicSort;

public class FindDuplicateNumber1 {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 2, 2};
		int res = findDuplicate(arr);
		System.out.println(res);
	}
	
	
	static int findDuplicate(int[] nums) {
		int start = 0;
		
		while(start < nums.length) {
			if(nums[start] != start + 1) {
				int correct = nums[start] - 1;
				if(nums[start] != nums[correct]) {
					swap(nums, start, correct);
				}
				else {
					return nums[start];
				}
			}
			else {
				start++;
			}
		}
		return - 1;
	}
	
	static void swap (int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
