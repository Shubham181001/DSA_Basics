package string;

import java.util.Scanner;

public class Cap_ques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = moveAtFront(str);
		System.out.println(str);
	}
	
	static String moveAtFront(String str) {
		for(int i = 0; i <= str.length() - 1; i++) {
			int r = i;
			if(str.charAt(i) == '#') {
				for(int j = r - 1; j >= 0; j--) {
					str = swap(str, j, r);
					r--;
				}
			}
		}
		return str;
	}
	
	static String swap(String str, int start, int end) {
		char[] ch = str.toCharArray();
		
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		
		str = String.valueOf(ch);
		
		return str;
	}
}
