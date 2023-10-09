package arrays_K;

import java.util.Scanner;

public class SubsetOfArray {

	    public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int[][] arr = new int[n][n];
	        
	        for(int i = 0; i < arr.length; i++){
	            for(int j = 0; j < arr[0].length; j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        
	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < arr.length; i++){
	            int j;
	            int min = Integer.MAX_VALUE;
	            for(j = 0; j < arr[0].length; j++){
	                if(arr[i][j] < min){
	                    min = arr[i][j];
	                }
	            }
	            int minIndex = linearSearch(arr[i], min);
	            max = maximum(arr, minIndex);
	            if(min == max){
	                System.out.print(min);
	            }
	        }
	        
	    }
	    
	    public static int linearSearch(int[] arr, int target){
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] == target){
	                return i;
	            }
	        }
	        return -1;
	    }
	    
	    public static int maximum(int[][] arr, int col){
	        int max = Integer.MIN_VALUE;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i][col] > max){
	                max = arr[i][col];
	            }
	        }
	        
	        return max;
	    }
}
