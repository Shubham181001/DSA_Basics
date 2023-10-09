package fundamental;

import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {13, 23, 53, 23, 52};
		int res = secondHighest(arr);
		System.out.println(res);
	}
	
	static int secondHighest(int[] arr) {
		int high = Integer.MIN_VALUE;
		int second_High = Integer.MIN_VALUE;
		for(int i = 0; i <= arr.length - 1; i++) {
			if(arr[i] > high) {
				second_High = high;
				high = arr[i];
			}
			else {
				if(arr[i] > second_High) {
					second_High = arr[i];
				}
			}
		}
		return second_High;
	}
}
