package Core_Java.Encapsulation;

public class RunEncap {
	public static void main(String[] args) {
		TestEncapsulation t = new TestEncapsulation();
		System.out.println(t.getA());
		
		t.setA(10);
		System.out.println(t.getA());
	}

}
