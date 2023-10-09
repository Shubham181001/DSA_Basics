package arrays_K;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		// If the programmer is not sure about the number of inputs user is going to provide then it is always a better option to use array list instead of array.
		// Because array list is the dynamic version of array.
		// It is the advanced and enhanced version of array.
		// ArrayList is similar to Vector in CPP.
		
		// Syntax
		ArrayList<Integer> list = new ArrayList<>(4);//here 4 is known as initial capacity.
		
		Scanner in = new Scanner(System.in);
		list.add(45);
		list.add(67);
		list.add(98);
		list.add(23);
		list.add(73);
		
//		System.out.println(list.contains(73));//It basically checks that list contains that specific item or not.
		
		System.out.println(list);
		
		list.set(0, 99);//Here 0 represents index and 99 represents the value that to be put over that index.
		list.remove(3);//It removes the value of that index.
		System.out.println(list);
		
		//Input
		for(int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}
		
		//Get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));// pass index
		}
	}
}
