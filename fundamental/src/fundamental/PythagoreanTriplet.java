package fundamental;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = -1;
		if(a >= b && a >= c) {
			max = a;
		}
		else if(b >= c && b >= a) {
			max = b;
		}
		else {
			max = c;
		}
		
		if(max == a) {
			if((b * b) + (c * c) == max * max) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
		else if(max == b) {
			if((a * a) + (c * c) == max * max) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
		else{
			if((b * b) + (a * a) == max * max) {
				System.out.print(true);
			}
			else {
				System.out.print(false);
			}
		}
	}
}
