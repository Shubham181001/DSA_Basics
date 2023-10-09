package string;

import java.util.Scanner;
public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int count = 26;
		for(int i = 0; i <= str.length() - 1; i++) {
			for(int j = 0; j <= arr.length - 1; j++) {
				if(str.charAt(i) == arr[j]) {
					count--;
					arr[j] = '0';
					break;
				}
			}
		}
		
		if(count == 0) {
			System.out.print("Pangram");
		}
		else {
			System.out.print("Not Pangram");
		}
	}
}
