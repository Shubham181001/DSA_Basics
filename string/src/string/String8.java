package string;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean res = isSubsequence(a, b);
		System.out.println(res);
	}
	
	static boolean isSubsequence(String a, String z) {
		for(int i = 0; i <= a.length() - 1; i++) {
			if(a.charAt(i) != z.charAt(i)) {
				boolean res = findRest(a, z, i);
				if(res == false) return false;
			}
			else {
				for(int k = i + 1; k <= z.length() - 1; k++) {
					if(a.charAt(i) == z.charAt(k)) {
						break;
					}
					else {
						boolean res = findRest(a, z, i);
						if(res == false) return false;
					}
				}
			}
		}
		return true;
	}
	
	
	static boolean findRest(String a, String z, int i) {
		for(int j = i + 1; j <= a.length() - 1; j++) {
			if(a.charAt(j) == z.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
