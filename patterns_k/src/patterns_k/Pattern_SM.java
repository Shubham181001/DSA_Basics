package patterns_k;

import java.util.Scanner;
public class Pattern_SM {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);

	     // write ur code here
	     int n = scn.nextInt();
	     for(int row = 1; row <= n; row++){
	        for(int col = 1; col <= row; col++){
	            System.out.print(col + "\t");
	        }
	        
	        for(int spaces = 1; spaces <= 2 * (n - row) - 1; spaces++){
	                System.out.print("\t");
	        }
	        
	        if(row <= n){
	            for(int col = row; col >= 1; col--){
	            System.out.print(col + "\t");
	        }
	        }
	        else{
	            for(int col = row - 1; col >= 1; col--){
	                System.out.print(col + "t");
	            }
	        }
	        System.out.println();
	     }
	}
}
