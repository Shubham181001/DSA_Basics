package fundamental;

import java.util.Scanner;

public class TechMahindra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		char[] arr = new char[n];
		
		for(int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.next().charAt(0);
			
			if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' && arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U') {
				count++;
			}
		}
		System.out.print(count);
	}
}
