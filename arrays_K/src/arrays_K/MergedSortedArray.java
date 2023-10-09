package arrays_K;

import java.util.Arrays;
import java.util.Scanner;

public class MergedSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int[] arr = new int[size1];
		
		for(int i = 0; i < size1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int size2 = sc.nextInt();
		int[] arr1 = new int[size2];
		
		for(int i = 0; i < size2; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] res = new int[size1 + size2];
		int i = 0; 
		int j = 0;
		int count = 0;
		while(i < arr.length && j < arr1.length) {
			if(arr[i] == arr1[j]) {
				res[count] = arr[i];
				count++;
				res[count] = arr1[j];
				i++;
				j++;
			}
			else {
				if(arr[i] < arr1[j]) {
					res[count] = arr[i];
					count++;
					i++;
				}
				else {
					res[count] = arr1[j];
					count++;
					j++;
				}
			}
		}
		
		if(i > arr.length - 1 && j < arr1.length) {
			for(int k = j; k < arr1.length; k++) {
				res[count] = arr1[k];
				count++;
			}
		}
		else {
			for(int k = i; k < arr.length; k++) {
				res[count] = arr[k];
				count++;
			}
		}
		
		
		System.out.println(Arrays.toString(res));
	}
}
