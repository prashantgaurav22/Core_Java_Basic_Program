package Core_Java.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort 
{
	public static void main(String[] args) {
	
    ArrayList<Integer> al = new ArrayList<>();
	al.add(30);
	al.add(60);
	al.add(20);
	al.add(80);
	al.add(10);
	
	System.out.println(al);
	
	System.out.println("Ascending Order");
	Collections.sort(al);
	System.out.println(al);
	
	System.out.println("Descending Order");
	Collections.sort(al, Collections.reverseOrder());
	System.out.println(al);
	}
}
