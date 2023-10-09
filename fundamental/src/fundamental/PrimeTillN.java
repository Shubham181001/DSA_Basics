package fundamental;
import java.util.Scanner;

public class PrimeTillN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Range = ");
		int i = sc.nextInt();
		System.out.println("Enter The Second Number = ");
		int j = sc.nextInt();
		
		while(i<=j) {
			int count = 0;
			for (int k = 2 ; k<=i;k++) {
				
				
				if(i%k==0) {
					
					count++;

				}
				
				else if(count==0)
				{
					System.out.println(i);
					break;
					
				}
				
		}
			
			i++;
			
		}
		
	}
}
