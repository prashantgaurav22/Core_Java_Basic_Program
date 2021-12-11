package Core_Java.Collection.List.Vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;


public class Employee 
{
  private int id;
  private String name;
  private String loc;
  
  public Employee(int id,String name,String loc)
  {
	  this.id=id;
	  this.name=name;
	  this.loc=loc;
	}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getLoc() {
	return loc;
}
 public static void main(String[] args) 
 {
	Employee e1 = new Employee(22,"Ravi","Goa");
	Employee e2 = new Employee(33,"Ramesh","Chennai");
	
	Vector<Employee> vc = new Vector<>();
	vc.add(e1);
	vc.add(e2);
	
	LinkedList<Employee> ll = new LinkedList<>();
	ll.addAll(vc);
	
	
	Iterator<Employee> itr = ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	 	
	}
		
	}
