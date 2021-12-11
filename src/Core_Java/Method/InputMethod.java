package Core_Java.Method;

public class InputMethod {

	void add(int a,int b) {
		int c = a+b;
	System.out.println(c);
	}
	public static void main(String[] args) {
		InputMethod a = new InputMethod();
		a.add(2, 3);
		
		InputMethod b = new InputMethod();
		b.add(5, 6);
		
		InputMethod c = new InputMethod();
		c.add(8, 12);
	}
}
