package Core_Java.Collection.List.ArrayList;

import java.util.ArrayList;

public class TestAL {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		al.add("Guldu");
		al.add("Sundra");
		al.add("Sundri");
		
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		al.remove("Sundra");
		System.out.println(al);
	}

}
