package arrays_K;

import java.util.Scanner;

public class Counting_Pair {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1};
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		int result = getPairsCount(arr, sum);
		System.out.println(result);
	}

	 static int getPairsCount(int[] arr, int sum) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == sum)
					count++;
			}
		}
		return count;
	}
}
