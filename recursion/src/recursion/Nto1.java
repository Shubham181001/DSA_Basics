package recursion;

import java.util.Scanner;

public class Nto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		fun(num);
	}
	
	static void fun(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n); 
		fun(n - 1);
		System.out.println(n);
	}
}
