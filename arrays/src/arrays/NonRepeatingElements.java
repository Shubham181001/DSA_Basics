package arrays;

public class NonRepeatingElements {
	
	
	public static int checkFirstNonRepeatingElement(int[] arr)
	{
		int result = 0;
		for(int i = 0;i<arr.length-1;i++)
		{
			int j;
			for(j = 0;j<arr.length;j++)
			 if(i!=j&&arr[i]==arr[j])
				 break;
			if(j==arr.length)
				return arr[i];
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,4,9,6,7,4};
		int result = checkFirstNonRepeatingElement(arr);
		System.out.println("First non repeating element is:"+result);
	}

}
