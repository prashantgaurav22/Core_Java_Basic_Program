package Core_Java.Abstraction.AbstractClass;

public class AXIS extends RBI{

	@Override
	void getOfInterest() 
	{
	    int p = 2000;
	    int t = 2;
	    double r = 3.5;
	    double interest =  (p*r*t)/100;
	    System.out.println("Axis interest is: "+interest);
	}
	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.getOfInterest();
		AXIS a = new AXIS();
		a.getOfInterest();
	}

}
