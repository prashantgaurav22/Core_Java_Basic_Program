package Core_Java.Polymorphism;

public class Son extends Father{
String name = "Small Guldu";
void drive()
{
	System.out.println("He knows to drive a bike");
}
void smoke()
{
	System.out.println("Son smokes");
}
	public static void main(String[] args) {
		Father f = new Son();
		f.drive();
		
		f.drink();
		System.out.println(f.name);

	}

}
