package arrays_K;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
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
		    int j = arr1.length - 1;
		    int sum = 0;
		    int pos = 1;
		    int d = 0;
		    int rv = 0;
		    for(int i = arr2.length - 1; i >= 0; i--){
		        arr2[i] += carry; 
		        if(j >= 0) {
		        	if(arr2[i] >= arr1[j]){
			            d = (arr2[i] - arr1[j]);
			            carry = 0;
			        }
			        else{
			            carry = -1;
			            d = (arr2[i] + 10 - arr1[j]);
			        }
		        }
		        else {
		        	d = arr2[i];
		        }
		        rv = rv + d * pos;
		        pos *= 10;
		        j--;
		    }
		    
		    int numOfDigits = (int)Math.log10(rv) + 1;
		    while(rv > 0) {
		    	int q = rv / (int)Math.pow(10, numOfDigits - 1);
		    	System.out.println(q);
		    	
		    	rv = rv % (int)Math.pow(10, numOfDigits - 1);
		    	numOfDigits--;
		    }
	}
}
