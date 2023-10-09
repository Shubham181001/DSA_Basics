package sorting;

import java.util.Arrays;

public class BubbleSort {
     // Bubble sort is a comparison sort method
	// Bubble sort is also known as sinking sort
	// And Bubble sort is also known as Exchange Sort
	public static void main(String[] args) {
		int[] arr = {3, 1, 5, 4, 2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr) {
		boolean swapped;
		// run the steps n- 1;\ times
		for(int i = 0; i < arr.length -i; i++) {
			swapped = false;
			// for each step, max item will come at the last repsective index
			for(int j = 1; j < arr.length - i; j++) {
				// swap if the item is smaller than the previous item
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			
			// if you did not swap for a particular value of i, it means the array is sorted, hence stop the program.
			
			if(!swapped) { // !false = true;
				break;
			}
		}
		
	}
	
	
}
