package Core_Java.Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 
{
 public static void main(String[] args) {
	 HashMap<Integer,String> hm = new HashMap<>();
	 
	 hm.put(1, "Apple");
	 hm.put(2, "Watermelon");
	 hm.put(3, "Mango");
	 hm.put(4, "Guava");
	 
	 System.out.println(hm);
	 
	 for(Map.Entry m :hm.entrySet())
	 {
		 System.out.println(m.getKey()+" "+m.getValue());
	 }
	
	
}
}
