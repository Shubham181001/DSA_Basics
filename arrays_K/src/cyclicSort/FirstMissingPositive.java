package cyclicSort;


// Amazon question
public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] arr = {1};
		int res = firstMissingPositiveNo(arr);
		System.out.println(res);
 	}
	
	static int firstMissingPositiveNo(int[] nums) {
		int start = 0;
		while(start < nums.length) {
			int correct = nums[start] - 1;
			if(nums[start] < nums.length && nums[start] > 0 && nums[start] != nums[correct]) {
				swap(nums, start, correct);
			}
			else {
				start++;
			}
		}
		
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] != (index + 1)) {
				return (index + 1);
			}
		}
		return nums.length + 1;
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
