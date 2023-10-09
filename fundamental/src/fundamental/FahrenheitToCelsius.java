package fundamental;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		int start,end,w;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Start value:");
		start = s.nextInt();
		System.out.print("Enter End value:");
		end = s.nextInt();
		System.out.print("Enter Step value:");
		w = s.nextInt();
		int fahrenheit = start;
		if((start<=80&&start>=0)&&(end<=900&&end>=start)&&(w<=40&&w>=0))
		{
			while(fahrenheit<=end)
			{
				int celsius = (5*(fahrenheit-32))/9;
				System.out.print(fahrenheit+"\t"+celsius+"\n");
				fahrenheit = fahrenheit+w;
			}
		}
		else
		{
			System.out.println("Please Provide Correct Inputs.");
		}
	}

}
