package switch_Case_Statements;

import java.util.Scanner;

public class Switch_Statement {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String fruit  = in.next();
//		
//		switch (fruit)
//		{
//		case "Mango" :
//			System.out.println("King of fruits");
//		    break;
//		case "Apple" :
//			System.out.println("A sweet red fruit");
//			break;
//		case "Orange" :
//			System.out.println("Round fruit");
//			break;
//		case "Grapes" :
//			System.out.println("Small fruit");
//			break;
//		default :
//			System.out.println("Please enter a valid fruit");
//		}
		
		
		//New switch case statement that is only restricted to java programming.
		int day = in.nextInt();
//		switch(day) {
//		case 1 -> System.out.println("Monday");
//		case 2 -> System.out.println("Tuesday");
//		case 3 -> System.out.println("Wednesday");
//		case 4 -> System.out.println("Thursday");
//		case 5 -> System.out.println("Friday");
//		case 6 -> System.out.println("Saturday");
//		case 7 -> System.out.println("Sunday");
//		default -> System.out.println("Please choose the number between 1 and 7");
//		}
		
		//Q: Weekdays and Weekend program with day number.
		switch(day)
		{
		case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
		case 6, 7 -> System.out.println("Weekend");
		}
		
		
	}
}
