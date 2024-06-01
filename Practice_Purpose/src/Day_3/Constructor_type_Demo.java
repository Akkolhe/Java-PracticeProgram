package Day_3;

public class Constructor_type_Demo {
	
	int original_sum;
	
	public Constructor_type_Demo()
	{
		int sum=6;
	}
	
	public Constructor_type_Demo(int sum)
	{
		original_sum=sum;
	}
	String name()
	{
	
	 String name = "Abhijit Kolhe";
	 
	 return name;
	 
	}
	
	 public static void main (String args [])
	{
		Constructor_type_Demo ctd = new Constructor_type_Demo();
		Constructor_type_Demo ctd1 = new Constructor_type_Demo(6);
		Constructor_type_Demo ctd2 = new Constructor_type_Demo(12);
		System.out.println(ctd1.original_sum);
		System.out.println(ctd.original_sum);
		System.out.println(ctd2.original_sum);
		
		
		
		
		String gh= ctd.name(); 
		System.out.println(gh);
	}

}
