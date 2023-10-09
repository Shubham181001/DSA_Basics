package arrays_K;

import java.util.Scanner;

public class ContainerWIthMostWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int area = findMax(arr);
		System.out.print(area);
	}
	
	
	public static int findMax(int[] height) {
		int h = 0;
        int width = 0;
        int water = 0;
        int i = 0;
        int j = height.length;
        while(i < j){
            width = j - i;
            h = height[i] > height[j] ? height[j--] : height[i++];
            if(h * width > water){
                water = h * width;
            }
        }
        return water;
	}
}
