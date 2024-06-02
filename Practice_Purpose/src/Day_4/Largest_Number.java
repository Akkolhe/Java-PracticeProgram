package Day_4;

import java.util.Scanner;

public class Largest_Number {
	
	public static void largestNumber(int number1, int number2 ,int number3)
	{
		if(number1>number2 && number1>number3)
		{
			System.out.println("The given number is greater  "+number1);
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("The given number is greater "+number2);
		}
		else if(number3>number1 && number3>number2)
		{
			System.out.println("The given number is greater "+number3);
		}
		
		else {
			System.out.println("Give the correct number in input");
		}
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		sc.close();
		
		Largest_Number.largestNumber(num1,num2,num3);
		

	}

}
