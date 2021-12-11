package Core_Java.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Company {
	private int id;
	private String name;
	private String loc;
	
	public Company(int id,String name,String loc)
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
	Company c1 = new Company(12,"Ravi","Dallas");
	Company c2 = new Company(22,"Sanjay","New York");
	Company c3 = new Company(33,"Ajay","Mexico");
  
	HashSet<Company> hs = new HashSet<>();
	hs.add(c1);
	hs.add(c2);
	hs.add(c3);
	
	Iterator<Company> itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	for (Company comp : hs)
	{
	System.out.println(comp.getId()+" "+comp.getName()+" "+comp.getLoc());
	}
}}