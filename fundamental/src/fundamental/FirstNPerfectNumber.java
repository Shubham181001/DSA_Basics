package fundamental;

import java.util.Scanner;

public class FirstNPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		int res = 0;
		while(true) {
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					res += j;
				}
			}
			
			if(res == i) {
				if(count <= n)
				{
				System.out.print(i + " ");
				count = 1;
				}
				else {
					break;
				}
			}
			else {
				if(count > n) {
					break;
				}
			}
			res = 0;
			i++;
		}
	}
}
