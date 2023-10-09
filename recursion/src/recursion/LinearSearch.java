package recursion;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3, 15, 12, 14, 16};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean res = linSearch(arr, num, 0);
		System.out.println(res);
	}
	
	static boolean linSearch(int[] arr, int num, int index) {
		if(index == arr.length) {
			return false;
		}
		
		return arr[index] == num || linSearch(arr, num, index + 1);
	}
	
	static int linSearch2(int[] arr, int num, int index) {
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == num) {
			return index;
		}
		else {
			return linSearch2(arr, num, index + 1);
		}
		
	}
}
