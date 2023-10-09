package patterns_k;

import java.util.Scanner;
public class Pattern_Diff {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
//        int n = scn.nextInt();
//        int count = 1; 
//        int n1 = 0;
//        int n2 = 1;
//        int sum = 0;
//        for(int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++){
//               if(count == 1) {
//            	   System.out.print(n1 + "\t");
//               }
//               else if(count == 2) {
//            	   System.out.print(n2 + "\t");
//               }
//               else {
//            	   sum = n1 + n2;
//            	   n1 = n2;
//            	   n2 = sum;
//            	   System.out.print(sum  + "\t");
//               }
//               count++;
//            }
//            
//            System.out.println();
//        }
        
        int n = scn.nextInt();
        int temp;
        if((n & 1) == 0){
            temp = n / 2;
        }
        else{
            temp = n / 2 + 1;
        }
        
        for(int row = 1; row <= temp; row++){
            for(int spaces = 1; spaces <= temp - row; spaces++){
                System.out.print("\t");
            }
            int temp1 = row;
            for(int col = 1; col <= row; col++){
                System.out.print(temp1 + "\t");
                temp1++;
            }
            int temp2 = temp1 - 2;
            for(int col = row - 1; col >= 1; col--){
                System.out.print(temp2 + "\t");
                temp2--;
            }
            System.out.println();
        }
        
        for(int row = temp - 1; row >= 1; row--){
            for(int spaces = 1; spaces <= temp - row; spaces++){
                System.out.print("\t");
            }
            int temp1 = row;
            for(int col = 1; col <= row; col++){
                System.out.print(temp1 + "\t");
                temp1++;
            }
            int temp2 = temp1 - 2;
            for(int col = row - 1; col >= 1; col--){
                System.out.print(temp2 + "\t");
                temp2--;
            }
            System.out.println();
        }
    }
}
