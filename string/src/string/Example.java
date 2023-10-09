package string;

public class Example {

	public static void main(String[] args) {
		String str1 = "Kushagra", str2 = "Verma";
		String str3 = "" + str1;
		str1 = str2;
		str2= str3;
		System.out.print(str2);
	}
}
