package fundamental;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		for(int i = 0; i < t; i++) {
//			int n = sc.nextInt();
//			int j;
//			for(j = 2; j * j <= n; j++) {
//				if(n % j == 0) {
//					System.out.println("not prime");
//					break;
//				}
//			}
//			if(j * j > n) {
//				System.out.println("prime");
//			}
//		}
		
//		 Scanner sc = new Scanner(System.in);
//	      int n = sc.nextInt();
//	      int rem = 0;
//	      int sum = 0;
//	      while(n > 0){
//	          rem = n % 10;
//	          sum = sum * 10 + rem;
//	          n /= 10;
//	      }
//	      System.out.println(sum);
//	      while(sum > 0){
//	          rem = sum % 10;
//	          System.out.println(rem);
//	          sum /= 10;
//	      }
		
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int rev = 0;
	     int rem = 0;
	     while(n > 0){
	        rem = n % 10;
	        rev = rev * 10 + rem;
	        n /= 10;
	     }
	     System.out.println(rev);
	}
}
