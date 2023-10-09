package arrays_K;

import java.util.ArrayList;

import java.util.Scanner;

public class MultiAL {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();// This is array list of array list
		
		for(int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());// Creating new Array Lists for the root Array List
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				list.get(i).add(in.nextInt());// Adding elements to the child or leaf Array List.
			}
		}
		
		System.out.println(list);
	}
}
