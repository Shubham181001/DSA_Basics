package math_For_DSA;

import java.util.Scanner;

public class Newton_Raphson_Sqrt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double sqrt = sqrt(num);
		System.out.println(sqrt);
	}
	
	static double sqrt(double n) {
		double x = n;
		double root;
		while(true) {
			root = 0.5 * (x + (n / x));
			
			if(Math.abs(root - x) < 1) {
				break;
			}
			
			x = root;
		}
		
		return root;
	}
	
}
