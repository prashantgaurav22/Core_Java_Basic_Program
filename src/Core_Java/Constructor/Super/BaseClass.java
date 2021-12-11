package Core_Java.Constructor.Super;

public class BaseClass {
	
	int i;
	public BaseClass()
	{
		this(1,2);
		System.out.println(i);//0
	}
 
	public BaseClass(int s)
	{
		this();
		System.out.println(s);//12
	}
   public BaseClass(int a,int b)
   {
	   System.out.println(a);//1
   }
}

