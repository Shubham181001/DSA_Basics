package recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class FindAllIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int[] arr = {1, 2, 3, 4, 4, 8};
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(allIndexes(arr, target, 0, list));
		System.out.println(allIndexes2(arr, target, 0));
	}
	
	// returning the array list data using recursion and passing the array list inside arguments
	static ArrayList<Integer> allIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(index == arr.length) {
			return list;
		}
		
		if(arr[index] == target) {
			list.add(index);
		}
		return allIndexes(arr, target, index + 1, list);
	}
	
	//Approach to return array list without passing array list inside the arguments
	static ArrayList<Integer> allIndexes2(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>(); 
		
		if(index == arr.length) {
			return list;
		}
		
		// this will contain the answer for that function call only
		if(arr[index] == target) {
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls = allIndexes2(arr, target, index + 1);
		list.addAll(ansFromBelowCalls);
		return list;
	}
}
