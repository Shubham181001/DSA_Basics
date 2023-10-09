package string;

import java.util.Scanner;

public class Cyntexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int max = 0;
		int count = 0;
		int temp = 0;
		
		for(int i = 0; i <= str.length() - 1; i++) {
			if(count == 0) {
				if(max <= temp) {
					max = temp; 
					temp = 0;
				}
			}
			
			if(count == 0 && str.charAt(i) == ')') {
				continue;
			}
			
			else if(str.charAt(i) == '(') {
				count++;
			}
			
			else {
				if(str.charAt(i) == ')') {
					if(count > 0) {
						count--;
						temp = temp + 2;
					}
					
					if(max < temp) {
						max = temp;
					}
				}
			}
		}
		System.out.print(max);
	}
}
