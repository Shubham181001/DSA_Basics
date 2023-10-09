package recursion_again;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = fact(n);
		System.out.println(ans);
	}
	
	static int fact(int num) {
		if(num <= 1) {
			return num;
		}
		return num * fact(num - 1);   
	}
}
