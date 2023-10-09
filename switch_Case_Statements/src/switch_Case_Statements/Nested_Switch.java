package switch_Case_Statements;

import java.util.Scanner;

public class Nested_Switch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int empID = in.nextInt();
		String department = in.next();
		
//		switch(empID)
//		{
//		case 1: 
//			System.out.println("Shubham Agarwal");
//			break;
//		case 2:
//			System.out.println("Nikhil Yadav");
//			break;
//		case 3:
//			System.out.println("Employee number 3");
//			switch(department)
//			{
//			case "IT":
//				System.out.println("IT Department");
//				break;
//			case "Management":
//				System.out.println("Management Department");
//				break;
//			default:
//				System.out.println("No Department entered");
//			}
//			break;
//		default:
//			System.out.println("Enter correct EmpID");
//		}
		
		//Better and enhanced way to write above given program is listed below:
		switch(empID)
		{
		case 1 -> System.out.println("Shubham Agarwal");
		case 2 -> System.out.println("Nikhil Yadav");
		case 3 -> {
			System.out.println("Employee number 3");
			switch (department) {
			case "IT" -> System.out.println("IT Department");
			case "Management" -> System.out.print("Management Department");
			default -> System.out.println("No Department entered");
			}
		}
		default -> System.out.println("Enter correct empID");
		}
	}

}
