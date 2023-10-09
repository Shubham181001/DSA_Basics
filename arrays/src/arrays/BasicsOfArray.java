package arrays;

public class BasicsOfArray {
	
	public static void main(String[] args) {
		int arr [] = new int[10];//at the time are declaration by default the values are initialized with 0
		//int[] arr = new int[10]; this is also a valid declaration.
		arr[0]=5;
		arr[5] = 17;
		System.out.println(arr[0]+arr[5]);
		
		//arr[-1] = 18; this is not allowed because the indexing is only from 0 to 9 no negative indices are allowed
		//arr[10] = 15; this is also not allowed because the indexing is only from  0 to 9 no negatives and indices that are 10 or greater than that are also not allowed.
		System.out.println(arr[3]);// all the indices that are not initialized at the time of writing the code that are normally initialized with 0 in java.
		
		char[] cArray = new char[10];//by default values are initialized with null character.
		double[] dArray = new double[10];// by default values are initialized with 0.0
	}

}
