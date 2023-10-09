package math_For_DSA;

import java.util.Scanner;
import java.util.ArrayList;

public class Factor_Of_A_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		factors3(num);
	}
	 // Time: O(n)
	static void factors1(int num) {
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// Time : O(log(n))
	static void factors2(int num) {
		for(int i = 1; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				if(num / i == i) {
				System.out.print(" " + i + " ");	
				}
				else {
					System.out.print(i + " " + num / i +" ");
				}
			}
		}
	}
		
		
		static void factors3(int num) {
		   ArrayList<Integer> list = new ArrayList<>();
			for(int i = 1; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					if(num / i == i) {
					System.out.print(" " + i + " ");	
					}
					else {
						System.out.print(i + " ");
						list.add(num / i);
					}
				}
			}
			
			for(int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i) + " ");
			}
	}
	
	
	
}
