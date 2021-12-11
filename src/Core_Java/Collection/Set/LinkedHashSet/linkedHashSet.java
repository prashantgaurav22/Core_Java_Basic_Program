package Core_Java.Collection.Set.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet 
{
 public static void main(String[] args) {
	LinkedHashSet<Integer> ll = new LinkedHashSet();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(30);
	
	System.out.println(ll);
	
	System.out.println("HashSet");
	HashSet<Integer> hs = new HashSet<>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(30);
	
	System.out.println(hs);
}
}
