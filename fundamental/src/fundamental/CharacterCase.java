package fundamental;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		str = s.next();
		char ch;
		ch = str.charAt(0);
		int i = ch;
		if(i>=97&&i<123)
		{
			System.out.println(ch+" is a lower case alphabet:0");
		}
		else if(i>=65&&i<91)
		{
			System.out.println(ch+" is an upper case alphabet:1");
		}
		else
		{
			System.out.println(ch+" is not an alphabet:-1");
		}

	}

}
