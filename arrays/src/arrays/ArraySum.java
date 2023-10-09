package arrays;

import java.util.Scanner;

public class ArraySum {
	
	public static int sum(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for(int i = 0;i<size;i++)
		{
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public static int[] takeInput()
	{
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		size = s.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0;i<size;i++)
		{
			System.out.print("Enter the element at "+i+"th index:");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int result = sum(arr);
		System.out.println("The sum of the elements of the array is:"+result);
	}

}
