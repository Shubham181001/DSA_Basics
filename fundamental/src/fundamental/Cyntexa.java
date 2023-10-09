package fundamental;

import java.util.Scanner;

public class Cyntexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		int sum = 0; 
		int rem = 0;
		int temp = n;
		if((n & 1) == 0) {
			while(temp > 0) {
				rem = temp % 10;
				sum = sum * 10 + rem;
				temp /= 10;
			}
			while(sum > 0) {
				rem = sum % 10;
				for(int i = 0; i <= str.length - 1; i++) {
					if(i == rem) {
						System.out.print(str[i] + " ");
					}
				}
				sum /= 10;
			}
		}
		else {
			System.out.print("Not Applicable");
		}
	}
}
