package Core_Java.Method;

public class StaticInputMethod {

	static void add(int a,int b) {
		int c =a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		StaticInputMethod.add(2, 3);
		StaticInputMethod.add(5, 4);
	}
}
