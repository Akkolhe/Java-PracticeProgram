package Day_3;

// Swapping to numbers using Xor operator
public class Swap_twonumber {
	public static void swapNumber()
	{
		int first_number=39;
		int second_number=67;
		System.out.println(first_number);
		System.out.println(second_number);
		first_number=first_number ^ second_number; 
		second_number=first_number ^ second_number;
		first_number=first_number ^ second_number;
		System.out.println("Swapped to numbers ");
		System.out.println(first_number);
		System.out.println(second_number);
	}

	public static void main(String[] args) {
		Swap_twonumber.swapNumber();

	}

}
