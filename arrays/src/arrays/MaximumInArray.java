package arrays;

import java.util.Scanner;

public class MaximumInArray {
	
	public static int[] takeInput()
	{
		int size;
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++)
		{
			System.out.print("Enter the element at"+i+"th index:");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int Max(int[] arr)
	{
		int Max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>Max)
			{
				Max = arr[i];
			}
		}
		return Max;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int largest = Max(arr);
		System.out.println(largest+" is the largest element in the whole array");
	}

}
