package string;

public class Comparison {

	public static void main(String[] args) {
//		String a = "Shubham";
//		String b = "Shubham";
//		
//		// == 
//		System.out.println(a == b);// Comparison of Strings
		
		String a = new String("SHubham");
		String b = new String("SHubham");
		
		System.out.println(a == b);// values are same but created different objects inside heap but outside pool.
		//If some one want to only check that if values are same or not he/she can use .equals method instead of comparator operator because that operator also checks that referencing to the same object or not.
		
		System.out.println(a.equals(b)); 
	}
}
