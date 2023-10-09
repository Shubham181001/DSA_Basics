package string;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class String6 {

	public static void main(String[] args) {
//		String str = "Kushagra Verma";
//		List li = new ArrayList<>();
//		for(int i = 0; i <= str.length() - 1; i++) {
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
//				li.add(i);
//			}
//		}
//		System.out.print("The element a is present at the following indexes:" + li);
		
		Scanner sc = new Scanner(System.in);
		String str = "Shubham Agarwal";
		StringBuilder str1 = new StringBuilder();
		String str2 = sc.next();
		char ch = str2.charAt(0);
		for(int i = 0; i <= str.length() - 1; i++) {
			if(str.charAt(i) == ch || str.charAt(i) == 'A' + (ch - 'a')) {
				str1 = str1.append(i);
			}
		}
		int sum = 0;
		for(int i = 0; i <= str1.length() - 1; i++) {
			if(i > 0) {
				if(str1.charAt(i) < str1.charAt(i - 1)) {
					sum += Integer.parseInt(str1.charAt(i) + "" + str1.charAt(i + 1));
					i++;
				}
				else {
					sum += Character.getNumericValue(str1.charAt(i));
				}
			}
			else {
				sum += Character.getNumericValue(str1.charAt(i));
			}
		}
		System.out.println(sum);
	}
}
