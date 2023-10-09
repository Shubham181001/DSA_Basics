package recursion_again;

import java.util.Scanner;

public class Rec1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printn(n);
	}
	
	static void printn(int num) {
		if(num == 0) {
			return;
		}
		System.out.print(num + " ");
		printn(num - 1);
		System.out.print(num + " ");
	}
}
