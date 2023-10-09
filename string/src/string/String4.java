package string;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String z = sc.next();
		boolean res = isSubsequence(a, z);
		System.out.println(res);
	}
	
	static boolean isSubsequence(String a, String z) {
		for(int i = 0; i <= a.length() - 1; i++) {
			if(a.charAt(i) != z.charAt(i)) {
				for(int j = i + 1; j <= a.length() - 1; j++) {
					if(a.charAt(j) == z.charAt(i)) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
