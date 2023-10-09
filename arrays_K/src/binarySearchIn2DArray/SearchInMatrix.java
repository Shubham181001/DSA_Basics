package binarySearchIn2DArray;

public class SearchInMatrix {

	public static void main(String[] args) {
		int[][] arr = {
				{18, 9, 12},
				{36, -4, 91},
				{44, 33, 16}
		};
		int target = 91;
		String result = search(arr, target);
		System.out.println(result);
	}
	
	static String search(int[][] arr, int target) {
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					return "("+row+","+""+col+")";
				}
			}
		}
		return "";
	}
}
