package arrays_K;

import java.util.Scanner;

public class BestTimeToBuyAndSellAStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2, 4, 6, 8, 10};
		int start = 0; 
		int end = 0;
		int buyingPrice = arr[0];
		int max = -1;
		
		for(int i = 0; i <= arr.length - 1; i++) {
			if(buyingPrice > arr[i]) {
				buyingPrice = arr[i];
				start = i;
			}
			else {
				if(arr[i] - buyingPrice > max) {
					max = arr[i] - buyingPrice;
					end = i;
				}
			}
		}
		
		System.out.println("BEST TIME TO BUY THE STOCK IS ON DAY NO. " + (start + 1));
		System.out.println("BEST TIME TO SELL THE STOCK IS ON DAY NO. " + (end + 1));
		System.out.println("MAXIMUM PROFIT GAINED " + max);
	}
}
