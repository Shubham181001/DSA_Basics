package arrays_K;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int max = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		while(max > 0) {
//			for(int i = 0; i < arr.length; i++) {
//				if(arr[i] < max) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//			max--;
//		}
		
//		 Scanner sc = new Scanner(System.in);
//		    int n1 = sc.nextInt();
//		    int[] arr1 = new int[n1];
//		    int n2 = sc.nextInt();
//		    int[] arr2 = new int[n2];
//		    
//		    for(int i = 0; i < arr1.length; i++){
//		        arr1[i] = sc.nextInt();
//		    }
//		    for(int i = 0; i < arr2.length; i++){
//		        arr2[i] = sc.nextInt();
//		    }
//		    int count = 1;
//		    if(n1 >= n2){
//		        for(int i = 0; i < n1; i++){
//		            int j = 0;
//		            if(count <= n1 - n2){
//		                System.out.println(arr1[i]);
//		            }
//		            else{
//		               System.out.println(arr1[i] + arr2[j]);
//		               j++;
//		            }
//		            count++;
//		        }
//		    }
//		    
//		    else{
//		        for(int i = 0; i < n2; i++){
//		            int j = 0; 
//		            if(count <= n2 - n1){
//		                System.out.println(arr2[i]);
//		            }
//		            else{
//		                System.out.println(arr2[i] + arr1[j]);
//		                j++;
//		            }
//		            count++;
//		        }
//		    }
		
		 Scanner sc = new Scanner(System.in);
		    int n1 = sc.nextInt();
		    int[] arr1 = new int[n1];
		    
		    for(int i = 0; i < arr1.length; i++){
		        arr1[i] = sc.nextInt();
		    }
		    
		    int n2 = sc.nextInt();
		    int[] arr2 = new int[n2];
		    
		    for(int i = 0; i < arr2.length; i++){
		        arr2[i] = sc.nextInt();
		    }
		    
		    int carry = 0;
		    for(int i = arr2.length - 1; i >= 0; i--){
		        arr2[i] += carry; 
		        if(arr2[i] >= arr1[i]){
		            System.out.println(arr2[i] - arr1[i]);
		            carry = 0;
		        }
		        else{
		            carry = -1;
		            System.out.println(arr2[i] + 10 - arr1[i]);
		        }
		    }
	}
}
