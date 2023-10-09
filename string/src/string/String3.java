package string;

public class String3 {

	public static void main(String[] args) {
		String str = "Kushagra Verma";
		String str1 = new String();
		for(int i = 0; i <= str.length() - 1; i++) {
			int start = str.charAt(i);
			if(start != 'a') {
				if(start != 'A') {
					str1 = str1 + str.charAt(i);
				}
			}
			else {
				str1 = str1 + ' ';
			}
		}
		
		for(int i = 0; i <= str1.length() - 1; i++) {
			System.out.print(str1.charAt(i));
		}
	}
}
