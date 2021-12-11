package Core_Java.Collection.List.ArrayList;

import java.util.ArrayList;

public class TestArrList {
	public static void main(String[] args) {
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		System.out.println(al);
		
		for(Integer a : al)
		{
			System.out.println(a);
			
		}
		for (int i = 0; i <= al.size(); i++)
		{
		  System.out.println(al.get(i));
		}
		}
}
