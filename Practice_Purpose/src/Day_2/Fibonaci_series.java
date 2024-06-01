
/*
 * 0, 0+
 * 
 * */

package Day_2;

public class Fibonaci_series {

	public static void main(String[] args) {
		int n=7;
		int intial_number=0;
		int first_number=1;
		int final_number=0;
		while(n>0)
		{
			System.out.println(intial_number);
			intial_number=first_number;
			first_number=final_number;
			final_number=intial_number+first_number;
			
			n--;
			
				
			
			
		}

	}

}
