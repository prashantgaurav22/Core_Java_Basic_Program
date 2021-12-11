
package Core_Java.Collection.Iterable.Iterator;


import java.util.ArrayList;
import java.util.Iterator;



public class Student2 {
	int roll;
	String name;
	
	public Student2(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Student2 s1 = new Student2(20,"Prashant");
		Student2 s2 = new Student2(30,"Ravi");
	
		ArrayList<Student2> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		
		Iterator<Student2> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
