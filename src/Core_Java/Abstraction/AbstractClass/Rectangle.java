package Core_Java.Abstraction.AbstractClass;

public class Rectangle extends Shape{

	@Override
	void getarea() 
	{
	 int l = 2;
	 int b = 3;
	 int area = l*b;
	 System.out.println("Area of Rectangle is: "+area);
	}

	public static void main(String[] args) 
	{
	  Circle c = new Circle();
	  c.getarea();
	  Rectangle r = new Rectangle();
	  r.getarea();
	}
}
