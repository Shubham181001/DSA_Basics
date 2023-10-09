package recursion;

import java.util.Scanner;

public class Steps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = numberOfSteps(num);
		System.out.println(res);
	}
	
	static int numberOfSteps(int num) {
		return helper(num, 0);
	}
	
	static int helper(int num, int steps) {
		if(num == 0) {
			return steps;
		}
		
		if((num & 1)== 0) {
			return helper(num / 2, steps + 1);
		}
		return helper(num - 1, steps + 1);
	}
}
