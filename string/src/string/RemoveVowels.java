package string;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = {'a', 'e', 'i', 'o', 'u'};
		
		for(int i = 0; i <= str.length() - 1; i++) {
			for(int j = 0; j <= ch.length - 1; j++) {
				if(str.charAt(i) == ch[j]) {
					break;
				}
			}

		}
	}
}
