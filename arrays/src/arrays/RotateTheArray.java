package arrays;

import java.util.Scanner;

public class RotateTheArray {

	public static int[] RotateArray(int[] arr,int size,int d)
	{
		int temp[] = new int[size];
		int k = 0;
		for(int i = d;i<size;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		for(int i = 0;i<d;i++)
		{
			temp[k] = arr[i];
			k++;
		}
		for(int i = 0;i<size;i++)
		{
			arr[i] = temp[i];
		}
		return arr;
	}
	
	public static void PrintArray(int[] arr) {
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1,5,7,9};
		int d;
		int size;
		Scanner s = new Scanner(System.in);
		d = s.nextInt();
		size  = arr.length;
		arr = RotateArray(arr,size,d);
		PrintArray(arr);
	}
}
