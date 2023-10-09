package arrays_K;

import java.io.*;
import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        char[] arr = new char[n];
	        
	        for(int i = 0; i < arr.length; i++){
	            arr[i] = sc.next().charAt(0);
	        }
	        
	        int val = compress(arr);
	        System.out.print(Arrays.toString(arr));
	        System.out.print(val);
	}
	
	public static int compress(char[] chars) {
        char prev = chars[0];
        String str = chars[0] + "";
        int count = 1; 
        for(int i = 1; i < chars.length; i++){
            char next = chars[i];
            if(prev == next){
                count++;
            }
            else{
                if(count > 1){
                    str += count;
                    str += next;
                    count = 1;
                }
                else{
                    str += next;
                }
            }
            prev = next;
        }
        
        if(count > 1){
            str += count;
        }

        System.out.println(str);
        chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        return chars.length;
    }
}
