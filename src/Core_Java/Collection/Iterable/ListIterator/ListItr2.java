package Core_Java.Collection.Iterable.ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItr2 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ListIterator<Integer> litr = ll.listIterator();
		System.out.println("Forward Iteration");
		
		while(litr.hasNext())
		{
	      int x = litr.next();
	      
	      if(x==30)
	      {
	    	  litr.remove();
	      }
	      
		}
		System.out.println(ll);
		
	}

}

