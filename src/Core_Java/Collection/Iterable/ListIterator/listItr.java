package Core_Java.Collection.Iterable.ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class listItr {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
	ListIterator<Integer> litr = ll.listIterator();
	System.out.println("Forward Direction");
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("Backward Iterator");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
		}

}

