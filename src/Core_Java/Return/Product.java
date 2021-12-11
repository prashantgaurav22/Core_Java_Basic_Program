package Core_Java.Return;

public class Product {
	 String product() {
		int a=2;
		int b=3;
		int c=a*b;
	return "The product of two numbers is "+c;
	}
public static void main(String[] args) {
	Product p = new Product();
	p.product();
	System.out.println(p.product());	
}
}
