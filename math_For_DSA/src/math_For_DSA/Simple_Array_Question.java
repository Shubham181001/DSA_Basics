package math_For_DSA;

public class Simple_Array_Question {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 3, 4, 2, 6, 4};
		System.out.println(ans(arr));
	}
	
	static int ans(int[] arr) {
		int unique  = 0;
		
		for(int n : arr) {
			unique ^= n;
		}
		
		return unique;
	}
}
