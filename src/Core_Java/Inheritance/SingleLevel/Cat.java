package Core_Java.Inheritance.SingleLevel;

public class Cat extends Dog{
	void method3()
	{
		System.out.println("Cat drink Milk");
	}


public static void main(String[] args) {
	Cat a = new Cat();
	a.method1();
	a.method2();
	a.method3();

	System.out.println(a.name);


}
}
