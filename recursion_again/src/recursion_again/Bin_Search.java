package recursion_again;

import java.util.Scanner;

public class Bin_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		int ans = search(0, arr.length - 1, arr, target);
		System.out.println(ans);
	}
	
	static int search(int start, int end, int[] arr, int target) {
		if(start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if(arr[mid] == target) {
			return mid;
		}
		else if(target < arr[mid]) {
			return search(start, mid - 1, arr, target);
		}
			return search(mid + 1, end, arr, target);
	}
}
