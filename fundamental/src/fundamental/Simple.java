package fundamental;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		System.out.println("Dear " + name + " here is the counting:");
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
