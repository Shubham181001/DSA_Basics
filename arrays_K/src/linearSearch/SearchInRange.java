package linearSearch;

import java.util.Scanner;

public class SearchInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start_Index = sc.nextInt();
		int end_Index = sc.nextInt();
		int target = sc.nextInt();
		
		int ans = linearSearchInRange(arr, target, start_Index, end_Index);
		System.out.println(ans);
	}
	

	static int linearSearchInRange(int[] arr, int target, int s, int e) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = s; index <= e; index++) {
			
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		return -1;
	}
}
