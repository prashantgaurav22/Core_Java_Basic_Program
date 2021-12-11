package Core_Java.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinkedList {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(55);
		al.add(90);
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addAll(al);
		System.out.println(ll);
		
		
	}

}
