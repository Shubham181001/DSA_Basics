package appcino;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}
	
	static void pattern(int num) {
		String s = "";
		for(int row = 1; row <= num; row++) {
			s += "*";
			System.out.println(s);
		}
	}

}
