package fundamental;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		int a,b;
		try (Scanner s = new Scanner(System.in)) {
			a = s.nextInt();
			b = s.nextInt();
		}
		int c= a+b;
		System.out.println(c);
	}

}
