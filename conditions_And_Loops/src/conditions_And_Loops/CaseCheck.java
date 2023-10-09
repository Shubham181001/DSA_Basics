package conditions_And_Loops;

import java.util.Scanner;

public class CaseCheck {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char ch = in.next().trim().charAt(0);
		System.out.println(ch);
		
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("The provided letter is a Lower case letter");
		}
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("The provided letter is a Upper case letter");
		}
	}

}
