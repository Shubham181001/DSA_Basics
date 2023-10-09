package arrays;

import java.util.Scanner;

public class LinearSearch {
	
	public static int[] takeInput()
	{
		int size;
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter the element at "+i+"th index:");
			arr[i]= s.nextInt();
		}
		return arr;
	}
	
	public static int Search(int[] arr, int x)
	{
		int store = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
			  store = i;
			  break;
			}
		}
		return store;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number that is to be searched in array:");
		x  = s.nextInt();
		int result = Search(arr,x);
		System.out.println("The number "+x+" is found at index:"+result);
	}

}
