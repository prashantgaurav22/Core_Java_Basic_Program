package Core_Java.Abstraction.AbstractClass;

public class Circle extends Shape
{

	@Override
	void getarea() 
	{
	  int r = 3;
	  double area = 3.14*r*r;
	  System.out.println("Area of Circle is: "+area);
	}

}
