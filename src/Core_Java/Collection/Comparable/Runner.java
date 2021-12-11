package Core_Java.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
	public static void main(String[] args) {
		Student s1 = new Student(75,"Vijay",60.0);
		Student s2 = new Student(12,"Ajay",80.0);
		Student s3 = new Student(55,"Sujay",50.45);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		for (Student student : al) 
		{
		 System.out.println(student.Name+" "+student.rollNum+" "+student.per);	
		}
	}

}
