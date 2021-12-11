package Core_Java.Constructor;

public class Cartoon {
	String name="Guldu";
	String channel;

	
	public Cartoon(String name)
	{
		this.name=name;
		System.out.println(this.name);
	}

	public Cartoon(String name,String channel)
	{
		this.name=name;
		this.channel=channel;
		System.out.println(this.name+" "+this.channel);
		
	}
	public static void main(String[] args) {
		Cartoon c1 = new Cartoon("Tom and Jerry");
		Cartoon c2 = new Cartoon("Shaktiman");
		Cartoon c3 = new Cartoon("thor","Pojo");
	}
}
