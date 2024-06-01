import java.util.Scanner;

//Java Program to Read The Number From Standard Input
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first_number;
		int second_number;
	String name;
		System.out.print("Enter first number: ");
		first_number =sc.nextInt();
		System.out.print("Enter second number: ");
		second_number=sc.nextInt();
		System.out.print("Enter a name ");
		name=sc.next();
		
		
		System.out.println(" Reading first number from input"+first_number);
		System.out.println("Reading Second number from input "+second_number);
		System.out.println("Reading name from input "+name);
		sc.close();
		
		

	}

}
