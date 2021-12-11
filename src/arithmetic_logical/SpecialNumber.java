package arithmetic_logical;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");

		int n = sc.nextInt();
		int x = n / 10;
		int y = x % 10;
		int z = (x + y) + (x * y);
		if (n == z)
			System.out.println("Special Number");
		else
			System.out.println("Not Special Number");

	}
}
