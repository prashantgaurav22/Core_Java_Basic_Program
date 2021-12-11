package Core_Java.Method.MethodOverloading;

public class Addition {
	void add()
	{
		int a=2;
		int b=3;
		int c = a+b;
		System.out.println(c);
	}
	int add(int a,int b) 
	{
		int c = a+b;
		return c;
	}
	void add(int a, int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
		
	}
	void add(double b, int a)
	{
		double c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Addition a = new Addition();
		a.add();
		a.add(1, 2);
		a.add(1, 2, 3);
		a.add(2.0, 3);
	}
} 







