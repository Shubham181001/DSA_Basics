package recursion_again;

import java.util.Scanner;

public class CountingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = zero(n);
		System.out.println(ans);
	}
	
	static int zero(int num) {
		return helper(0, num);
	}
	
	static int helper(int count, int num) {
		if(num == 0) {
			return count;
		}
		int rem = num % 10;
		if(rem == 0) {
			return helper(count + 1, num / 10);
		}
		return helper(count, num / 10);
	}
}
