package recursion_again;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
//		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> ans = findAllIndices1(arr, target, 0);
//		int ans = linSearch(arr, target);
//		System.out.println(ans);
//		findAllIndices(arr, target, 0);
		System.out.println(ans);
	}
	
	static int linSearch(int[] arr, int target) {
		return helper(arr, target, 0);
	}
	
	static int helper(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}
		else {
			return helper(arr, target, index + 1);
		}
	}
	
	static ArrayList<Integer> list = new ArrayList<>();
	static void findAllIndices(int[] arr, int target, int index) {
		if(index == arr.length) {
			return;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		findAllIndices(arr, target, index + 1);
	}
	
	
	static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list1) {
		if(index == arr.length) {
			return list1;
		}
		if(arr[index] == target) {
			list1.add(index);
		}
		return findAllIndices(arr, target, index + 1, list1);
	}
	
	static ArrayList<Integer> findAllIndices1(int[] arr, int target, int index){
		ArrayList<Integer> ans = new ArrayList<>();
		if(index == arr.length) {
			return ans;
		}
		
		if(arr[index] == target) {
			ans.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls = findAllIndices1(arr, target, index + 1);
		ans.addAll(ansFromBelowCalls);
		return ans;
	}
}
