package math_For_DSA;

import java.util.Scanner;

public class RangeXOR {

	public static void main(String[] args) {
		// range xor for a, b = xor(b) * xor(a - 1)
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int count = start; count <= end; count++) {
			System.out.print(Integer.toBinaryString(count) + "  ");
		}
		System.out.println();
		int ans = xor(end) ^ xor(start - 1);
		
		
		// we can solve the same thing this way but this will give Time Limit Exceed for large numbers
		int ans2 = 0;
		for(int i = start; i <= end; i++) {
			ans2 ^= i;
		}
		
		System.out.println(ans2);
		
		System.out.println(ans);
	}
	
	// this gives xor from 0 to end
	static int xor(int a) {
		if(a % 4 == 0) {
			return a;
		}
		if(a % 4 == 0) {
			return 1;
		}
		if(a % 4 == 0) {
			return a + 1;
		}
		return 0;
	}
}
