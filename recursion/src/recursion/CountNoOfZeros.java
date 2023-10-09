package recursion;

import java.util.Scanner;

public class CountNoOfZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int count = zeros(num);
		int count1 = zeroRec(num, 0);
		System.out.println(count1);
//		System.out.println("The number of zeros in the given number is :" + count);
	}
	
	//Iterative Process
	static int zeros(int num) {
		int count = 0;
		int rem = 0;
		if(num == 0) {
			return 1;
		}
		while(num > 0) {
			rem = num % 10;
			if(rem == 0) {
				count++;
			}
			num /= 10;
		}
		return count;
	}
	
	//Recursive Approach
	static int zeroRec(int num, int count) {
		int rem = 0;
		rem = num % 10;
		if(num == 0) {
			return count;
		}
		if(rem == 0) {
			return zeroRec(num / 10, count + 1);
		}
			return zeroRec(num / 10, count);
	}
}
