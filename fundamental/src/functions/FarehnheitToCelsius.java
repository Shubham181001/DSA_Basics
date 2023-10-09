package functions;

import java.util.Scanner;

public class FarehnheitToCelsius {
	
	public static void Conversion(int start, int end, int step)
	{
		int fahrenheit = start;
		while(fahrenheit<=end)
		{
			int celsius = (5*(fahrenheit-32))/9;
			System.out.print(fahrenheit+"\t"+celsius+"\n");
			fahrenheit = fahrenheit+step;
		}
	}
	
	public static void main(String[] args) {
		int start, end, step;
		System.out.println("Enter the start value:");
		Scanner s = new Scanner(System.in);
		start = s.nextInt();
		System.out.println("Enter the end value:");
		end = s.nextInt();
		System.out.println("Enter the step value:");
		step = s.nextInt();
		Conversion(start,end,step);
	}

}
