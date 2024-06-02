package Day_4;

public class Addtion_of_Complex {
	int real,image;

	public Addtion_of_Complex(int real,int image)
	{
	     this.real=real;
	     this.image=image;
	}
	
	public void showc()
	{
		System.out.println(this.real+this.image+"i");
	}
	
	public static  Addtion_of_Complex complexnumAddtion(Addtion_of_Complex first, Addtion_of_Complex second)
	{
		Addtion_of_Complex res= new Addtion_of_Complex(0,0);
		
		res.real= first.real+second.real;
		
		res.image=first.image+second.image;
		
		
		return res;
		
		
	}
	public static void main(String[] args) {
	
		Addtion_of_Complex adc= new Addtion_of_Complex(4,6);
		
		Addtion_of_Complex adc1= new Addtion_of_Complex(7,6);
		
		adc.showc();
		adc1.showc();
		
		Addtion_of_Complex res = complexnumAddtion(adc,adc1);
		
		res.showc();
		
		
		
		
		
	}

}
