package Core_Java.Collection.List.Vector;

import java.util.Vector;

public class TestAB
{
	public static void main(String[] args) 
	{
	 Vector<String>	vl = new Vector<>();
	  vl.add("Ravi");
      vl.add("Prashant");
      vl.add("Vijay");
      
      //System.out.println(vl); // Display in Array Type
      for (String name : vl) 
      {
		System.out.println(name);
	}

}
}
