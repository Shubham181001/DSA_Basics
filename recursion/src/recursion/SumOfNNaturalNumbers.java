package recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = naturalSum(num);
		System.out.println(res);
	}
	
	static int naturalSum(int num) {
		if(num <= 1) {
			return 1;
		}
		
		return num + naturalSum(num - 1);
	}
}
