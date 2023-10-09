package fundamental;

import java.util.Scanner;

public class Typecasting {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//float num = input.nextFloat();
		
		//type casting 
//		int num = (int)(67.56);//This is explicit type casting also known as narrowing type casting.
//		System.out.println(num);
//		
//		//automatic type promotion in expression
//		int a  = 257;
//		byte b = (byte)(a);//In the case range exceeds it will provide remainder so in this case it will work like this 257%256=1
//		
//		byte a = 40;
//		byte b = 50;
//		byte c = 100;
//		int d = a*b/c;//a and b both are byte variables then how it is possible that they can store such a large value like 2000 so it is called type promotion all that intermediate calculation is done with the help of integer and not with the help of byte.
//		System.out.println(d);
		
//		byte b = 50;
//		b = b*4;//It will give you an error because all the calculation is done assuming that the numbers are integer ones. so if it is producing integer as a result then how can someone directly put integer into byte which shorter than that.
		int number = 'a';//Automatic type conversion.
		System.out.println(number);//Unlike C, Java works on Unicode value and not on ASCII value.
		
		//Automatic type promotion rules are as follows-
		//1. All the byte,short and character values are promoted to integers.
		//2. If anyone of the operand in calculation is long then whole operation is promoted to long.
		//3. If anyone of the operand in calculation is float then whole operation is promoted to float.
		//4. If it is double then the entire expression will be promoted to double.
		
	}

}
