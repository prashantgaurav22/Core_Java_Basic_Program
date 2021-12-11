package Core_Java.Encapsulation;

public class Samsung {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		System.out.println(m1.getName());
		System.out.println(m1.getPrice());
		m1.setName("Prime");
		m1.setPrice(25000);
		System.out.println(m1.getName());
		System.out.println(m1.getPrice());
	}
}
