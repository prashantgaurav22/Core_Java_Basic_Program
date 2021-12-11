package Core_Java.Block;

public class TestBook
{
   
	{
		System.out.println("Test Block 1");
	}
	{
		System.out.println("Test Block 2");
	}
	void display() 
	{
	 System.out.println("Display Method");	
	}
	public TestBook(int a)
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		TestBook b  =  new TestBook(10);
		b.display();
		TestBook b1 = new TestBook(10);
		b1.display();
	}
}
