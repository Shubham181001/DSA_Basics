package string;

import java.util.Scanner;

public class Run_Length_Encoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = RLE(str);
		System.out.println(str);
	}
	
	static String RLE(String str) {
		String s = str.charAt(0) + "";
		int count = 1;
		for(int i = 1; i <= str.length() - 1; i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);
			if(curr == prev) {
				count++;
			}
			else {
				s += count;
				count = 1;
				s += curr;
			}
		}
		if(count >= 1) {
			s += count;
			count = 1;
		}
		return s;
		}
}
