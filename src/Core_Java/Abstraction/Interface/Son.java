package Core_Java.Abstraction.Interface;

public class Son implements IMother,IFather{

	@Override
	public void drive() 
	{
		System.out.println("Son knows to Cook.");
	}

	@Override
	public void cook() 
	{
	 System.out.println("Son knows to Drive.");	
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.cook();
		s.drive();
	}
}
