package arrays;

import java.util.Scanner;

public class ArrangeNumbers {
	
	public static void printArray(int[] arr)
	{
		for(int i = 0;i<arr.length;i++)
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
		int[] arr = new int[size];
		int counter = 1;
		for(int i = 0;i<=((size-1)/2);i++)
		{
			arr[i]=counter;
			counter+=2;
		}
		int checker;
		if(size%2==0)
		{
			checker = size;
		}
		else {
			checker = size-1;
		}
		for(int i = ((size-1)/2)+1;i<size;i++)
		{
			arr[i] = checker;
			checker -= 2;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		printArray(arr);
	}

}
