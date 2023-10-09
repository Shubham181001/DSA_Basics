package arrays_K;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = majorityElement(arr);
		System.out.print(ans);
	}
	
	
	public static int majorityElement(int[] arr) {
		int val = validCandidate(arr);
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				count++;
			}
		}
		
		if(count > arr.length / 2) {
			return val;
		}else {
			return -1;
		}
	}
	
	public static int validCandidate(int[] arr) {
		int val = arr[0];
		int count = 1;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == val) {
				count++;
			}else {
				count--;
			}
			
			if(count == 0) {
				val = arr[i];
				count = 1;
			}
		}
		
		return val;
	}
}
