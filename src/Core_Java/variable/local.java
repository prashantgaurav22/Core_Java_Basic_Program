package Core_Java.variable;

public class local {
	
	 void add()
	{
		int a = 10;
		System.out.println("abc");
	}
	static void subtract()
	 {
		 int b = 20;
		 System.out.println(b);
	 }
	 
	public static void main(String[] args) {
		
		//for non static method 
		local a = new local();
         a.add();
		new local().add();
		
		 //for static method 
		 local.subtract();
		 
	}
	

}
