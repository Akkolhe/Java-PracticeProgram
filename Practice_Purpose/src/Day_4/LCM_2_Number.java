package Day_4;

public class LCM_2_Number {

	public static void main(String[] args) {
		int num1=15;
		
		int num2=25;
		
		int result=(num1>num2)? num1:num2;//25
		
		while(true)
		{
			if(result%num1==0 && result%num2==0)//
			{
				break;
			}
			result++;
		}

		System.out.println(result);
	}

}
