package Core_Java.WrapperClass;

public class TestAB {

	@Override
	public String toString() {
		
		return "Test";
	}

	@Override
	public int hashCode() {
		
		return 123456;
	}
	public static void main(String[] args) {
		
		TestAB t = new TestAB();
		System.out.println(t);
		System.out.println(t.hashCode()
				);
	}
	

}
