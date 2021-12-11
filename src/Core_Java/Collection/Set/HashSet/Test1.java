package Core_Java.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 
{
 public static void main(String[] args) {
	HashSet<Integer> hs = new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	
	//System.out.println(hs);
	System.out.println("Using Iterator");
	Iterator<Integer> itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("------------------");
	System.out.println("Using For each loop");
	for (Integer i : hs) 
	{
       System.out.println(i);		
	}
}
}
