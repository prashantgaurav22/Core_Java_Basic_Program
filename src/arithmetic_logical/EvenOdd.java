package arithmetic_logical;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to Check :");
		int n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		System.out.println("ThankYou");
	}
}
