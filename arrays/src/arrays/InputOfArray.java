package arrays;

import java.util.Scanner;

public class InputOfArray {
	
	public static void printArray(int[] arr)
	{
		int size = arr.length;
		for(int i = 0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static int[] takeInput()
	{
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of the array:");
		size = s.nextInt();
		int arr[]= new int[size];
		
		for(int i = 0;i<size;i++)
		{
			System.out.print("Enter the element at "+i+"th index:");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		printArray(arr);
	}

}
