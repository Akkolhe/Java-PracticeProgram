package Day_3;

//Java Program to Multiply Two Floating-Point Numbers

public class Multiply__Numbers {
	
	public static float multiplyingNumbers()
	{
		float first_number=23.5f;
		float second_number=34.5f;
		
		float storing_result;
		
		storing_result=first_number*second_number;
		
		return storing_result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Result=Multiply__Numbers.multiplyingNumbers();
		
		System.out.println("Multiply Two Floating-Point Numbers "+Result);

	}

}
