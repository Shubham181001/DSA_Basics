package string;

public class String5 {

	public static void main(String[] args) {
		String str = "Shubham Agarwal";
		for(int i = 0; i <= str.length() - 1; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				continue;
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
