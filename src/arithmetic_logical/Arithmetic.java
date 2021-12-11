package arithmetic_logical;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		System.out.println("Enter Larger Number and Press Enter: ");
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter Smaller Number and Press Enter: ");
		int y = sc.nextInt();

		System.out.println(x + " and " + y + " Sum is " + (x + y));
		System.out.println(x + " and " + y + " Difference is " + (x - y));
		System.out.println(x + " and " + y + " Product is " + (x * y));
		System.out.println(x + " and " + y + " Quotient is " + (x / y));
		System.out.println(x + " and " + y + " Remainder is " + (x % y));
	}
}
