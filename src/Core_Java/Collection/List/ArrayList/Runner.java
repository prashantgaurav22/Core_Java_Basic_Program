package Core_Java.Collection.List.ArrayList;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1(11,"Vijay",62.40);
		Student1 s2 = new Student1(12,"Ajay",77.80);
		Student1 s3 = new Student1(13,"Sanjay",45.9);
		
		ArrayList<Student1> al = new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (Student1 s : al) {
			
		
		System.out.println(s.rollNum+" "+s.getName()+" "+s.getPer());
	}
	}
}
