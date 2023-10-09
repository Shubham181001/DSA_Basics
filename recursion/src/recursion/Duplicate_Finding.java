package recursion;

public class Duplicate_Finding {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 5};
//		boolean res = containsDuplicate(arr);
//		System.out.println(res);
		boolean res = containsDuplicate(arr, 0);
		System.out.println(res);
	}
	
    // ITERATIVE APPROACH
	static boolean containsDuplicate(int[] arr) {
		for(int index = 0; index <= arr.length - 1; index++) {
			if(index == arr.length - 1) {
				return false;
			}
			int curr = arr[index];
			int next = arr[index + 1];
			if(curr == next && index <= arr.length - 2) {
				return true;
			}
		}
		return false;
	}
	
	// RECURSIVE APPROACH
	static boolean containsDuplicate(int[] arr, int index) {
		if(index == arr.length - 1) {
			return false;
		}
		
		return arr[index] == arr[index + 1] || containsDuplicate(arr, index + 1);
	}
}
