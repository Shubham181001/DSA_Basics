package recursion;

public class SortedOrNot {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 7, 9, 11, 13};
//		boolean res = sorted(arr, 0);
//		System.out.println(res);
		System.out.println(sorted2(arr, 0));
	}
	
	//First Approach
	static boolean sorted(int[] arr, int start) {
		if(start == arr.length - 1) {
			return true;
		}
		else {
			if(arr[start] < arr[start + 1]) {
			    return sorted(arr, start + 1);
			}
			else {
				return false;
			}
		}
		
	}
	
	//Second Approach
	static boolean sorted2(int[] arr, int index) {
		if(index == arr.length - 1) {
			return true;
		}
		
		return arr[index] < arr[index + 1] && sorted2(arr, index + 1);
	}
}
