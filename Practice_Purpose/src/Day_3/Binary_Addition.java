package Day_3;

public class Binary_Addition {
	
	public static void addingBinarynumbr(int x,int y)
	{
		int sum;
		
		sum=x+y;
		
		String sum_string=(Integer.toBinaryString(sum));
		
		System.out.println(sum_string);
		
	}

	public static void main(String[] args) {
		Binary_Addition.addingBinarynumbr(6, 14);

	}

}
