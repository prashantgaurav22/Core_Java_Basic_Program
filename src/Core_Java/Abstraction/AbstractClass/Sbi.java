package Core_Java.Abstraction.AbstractClass;

public class Sbi extends RBI{

	@Override
	void getOfInterest() 
	{
		int p = 1000;
	  	int t = 2;
	  	double r = 2.5;
	  	double interest = (p*r*t)/100;
	  	System.out.println("SBI Interest is: "+interest);
	}
}
	

		
	
