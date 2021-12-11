package Core_Java.Collection.Clone;

public class TestClone implements Cloneable
{
 int id;
 String name;
 public TestClone(int id,String name)
 {
	 this.id=id;
	 this.name=name;
	 
	 System.out.println(this.id+" "+this.name);
 }
@Override
protected Object clone() throws CloneNotSupportedException 
{

	return super.clone();
}
public static void main(String[] args) 
{
	TestClone c1 = new TestClone(11,"Apple");
	try 
	{
	TestClone c2 = (TestClone)c1.clone();
	System.out.println("c2 object:"+c2);
		
	}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
}
 System.out.println(c1.id+" "+c1.name);
}
}

