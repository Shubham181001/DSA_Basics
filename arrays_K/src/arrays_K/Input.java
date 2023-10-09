package arrays_K;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int[] arr = new int[5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		// Better and enhanced version of writing the above given for loop is 
//		
//		for (int num : arr) {// for every element in array, print the elements
//			//It is know as for each loop
//			System.out.print(num + " ");// here num represents element of the array
//		}
//		
//		// Another one line method to print all the elements of array or we can say traverse the array
//		
//		System.out.println(Arrays.toString(arr));
		
		// array of objects
		String[] str = new String[4];
		for (int i = 0; i < str.length; i++) {
			str[i] = in.next();
		}
		
		System.out.println(Arrays.toString(str));
	}
}
