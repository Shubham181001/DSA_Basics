package arrays_K;

public class Duplicate_Or_Not {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 5};
		boolean res = isDuplicate(arr);
		System.out.println(res);
	}
	
	static boolean isDuplicate(int[] arr) {
		int start = 0;
		while(start < arr.length - 1) {
			if(arr[start] == arr[start + 1]) {
				return true;
			}
			start++;
		}
		return false;
	}
}
