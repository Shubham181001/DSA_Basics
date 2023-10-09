package fundamental;

import java.util.Scanner; 

public class Average_Marks {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the student's name:");
	String str = s.next();
	char name= str.charAt(0);
	int m1,m2,m3,avg;
	System.out.print("Enter the value of marks1:");
	m1 = s.nextInt();
	System.out.print("Enter the value of marks2:");
	m2 = s.nextInt();
	System.out.print("Enter the value of marks3:");
	m3 = s.nextInt();
	avg = (m1+m2+m3)/3;
	System.out.println("Name of the student is:"+name);
	System.out.println("Average marks achieved by the student is:"+avg);
 }
}
