package Day_4;

import java.util.Scanner;

public class EvenOdd {
	
	public static int eveOdd()
	{
		Scanner sc = new Scanner(System.in);
		
		int number =sc.nextInt();
		sc.close();
		
		if(number%2==0)
		{
			System.out.println("The given number is even "+ number);
		}
		
		else
		{
			System.out.println("The given number is odd "+number);
		}
		
		return number;
		
		
	}

	public static void main(String[] args) {
		EvenOdd.eveOdd();

	}

}
