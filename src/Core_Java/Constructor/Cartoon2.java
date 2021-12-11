package Core_Java.Constructor;

public class Cartoon2 {
	String name;
	String Channel;
	
	
	public Cartoon2(String name)
	{
		
		this.name=name;
		System.out.println(this.name);
	}
	public Cartoon2(String name,String Channel)
	{
		this(45, "Pogo");
		this.name=name;
		this.Channel=Channel;
		System.out.println(this.name+" "+this.Channel);
	}
	public Cartoon2(int price,String name)
	{
		System.out.println("3rd Constructor");
	}
public static void main(String[] args) {
	Cartoon2 c1 = new Cartoon2("tom and Jerry");
	Cartoon2 c2 = new Cartoon2("Chota Bheem","Mickey");
}
}
