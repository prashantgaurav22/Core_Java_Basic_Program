package check;

import java.util.Scanner;

public class Number_Positive_Neg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to Check :");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("Number is Positive");
		} else if (n < 0) {
			System.out.println("Number is Negative");
		} else

			System.out.println("Number is Zero");
		System.out.println("ThankYou!");

	}
}
