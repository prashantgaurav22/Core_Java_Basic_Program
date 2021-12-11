package Core_Java.String;

public class TestString2 {
	public static void main(String[] args) {
		String s1 = new String("Sachin");
		String s2 = new String("Sachin");
		
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		// irrespective cases
	String s3 = new String("Sachin");
	String s4 = new String("sAcHiN");
	
	if(s3.equalsIgnoreCase(s4)) {
		System.out.println("True");
		
	}
	else
	{
		System.out.println("False");
	}
	}
	

}
