package Core_Java.Constructor.MainMethodOverload;

public class StaticMethodOverload {
	public static void main(String[] args) {
		
		System.out.println("Hi Welcome");
		StaticMethodOverload.main("Jspider");
	}
public static void main(String s1) {
	System.out.println("To"+" "+s1);
	StaticMethodOverload.main("Java","Class");
	
}
public static void main(String s1, String s2) {
	
	System.out.println("This is"+" "+s1+" "+s2);
	
}
}
