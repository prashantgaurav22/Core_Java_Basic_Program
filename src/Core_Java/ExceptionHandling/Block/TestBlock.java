package Core_Java.ExceptionHandling.Block;

public class TestBlock {
	static
	{
		System.out.println("Static block 1");
	}
	static 
	{
		System.out.println("Static block 2");
	}
	{
		System.out.println("Non-Static block");
	}
	public static void main(String[] args) {
		TestBlock t1 = new TestBlock();
		TestBlock t2 = new TestBlock();
		
		
		
	}
}
