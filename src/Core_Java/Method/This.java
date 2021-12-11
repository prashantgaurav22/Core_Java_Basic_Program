package Core_Java.Method;

public class This {
	int rollNum;
	String name;
	void getResult(int rollNum, String name)
	{
	//System.out.println(this.rollNum+" "+this.name);	
	this.rollNum = rollNum;
	this.name = name;
	System.out.println(this.rollNum+" "+this.name);
	}
public static void main(String[] args) {
	This b = new This();
	b.getResult(12, "Guldu");
}
}
