package Core_Java.Collection.Set.TreeSet;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeSet {
	public static void main(String[] args) {
		
	System.out.println("LinkedHashSet");
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
		
		System.out.println("TreeSet");
		TreeSet<String> ts = new TreeSet<>(); // Follows Order on Sorted Data
		ts.add("Vijay");
		ts.add("Ajay");
		ts.add("Sujay");
		ts.add("vijay");
		ts.add("Vikas");
   
		System.out.println(ts);
}
}

