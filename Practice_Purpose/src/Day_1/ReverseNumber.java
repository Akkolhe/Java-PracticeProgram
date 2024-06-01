package Day_1;

public class ReverseNumber {
	
	public static void main(String args[])
	{
		int number =121;
		int dupli_number=number;
		int remain=0;
		int sum=0;
		while(number!=0)
		{		
		 sum=number%10; //4
		remain=(remain*10)+sum; //40
		number=number/10;
		}
		System.out.println("reverse number will be"+ remain);
	
	
	if(dupli_number==remain)
	{
		System.out.println("its same number");
		
	}
	else
	{
		System.out.println("its not same number");
		
	}
	}
	

}
