package arrays;

import java.util.Scanner;

public class ArrangeNumbers1 {
	
	public static void printArray(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int[] takeInput()
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = s.nextInt();
		int left = 0;
		int right = size-1;
		int counter = 1;
		int[] arr = new int[size];
		while(left<=right)
		{
			if(counter%2==1)
			{
				arr[left] = counter;
				counter+=1;
				left+=1;
			}
			else {
				arr[right] = counter;
				counter+=1;
				right-=1;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		printArray(arr);
	}

}
