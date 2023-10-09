package linearSearch;

public class Linear_Search {

	public static void main(String[] args) {
		int[] arr = {18, 12, 9, 14, 77, 50};
		int result = Search(arr,50);
		
		System.out.println("50 is found at index:" + result);
	}

	 static int Search(int[] arr, int x) {
		
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] == x) {
				 return i;
			 }
		 }
		return -1;
	}
}
