package check;

import java.util.Scanner;

public class Digit2_Double {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check: ");
		int n = sc.nextInt();

		if (n >= -99 && n <= -10 || n >= 10 && n <= 99)
			System.out.println(n + " is a Two Digit Number");
		else
			System.out.println(n + " is not Two Digit Number");

		System.out.println("ThankYou!");
	}
}
