package Core_Java.Inheritance.SingleLevel;

public class Child extends Parent {
	void method2() 
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) {
		Child c = new Child();
		
		c.method2();
		c.method1();
		System.out.println(c.name);
	}
}
