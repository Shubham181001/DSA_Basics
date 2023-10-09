package questions;

public class MaximumConsecutive {

	public static void main(String[] args) {
		int[] arr = {};// you can insert any array elements you want
		int res = max_Consecutive(arr);
		System.out.println(res);
	}
	
	static int max_Consecutive(int[] arr) {
		int count1 = 0;
		int max = -1;
		for(int i = 0; i <= arr.length - 1; i++)
		{
			if(i < arr.length - 1 && arr[i] == arr[i + 1] - 1) {
				count1++;
			}
			else {
				if(max <= count1) {
					if(count1 == 0) {
						max = count1;
					}
					else {
						max = count1 + 1;
					}
				}
				count1 = 0;
			}
		}
		
		return max;
	}
}
