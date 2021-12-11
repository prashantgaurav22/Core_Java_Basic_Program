package Core_Java.Method;

public class This2 {
	void display() 
	{
		
		this.show();
		System.out.println("Display Method");
		
	}
	void show() 
	{
		System.out.println("Show Method");
	}
	public static void main(String[] args) {
		This2 t = new This2();
		t.display();
	}
}
