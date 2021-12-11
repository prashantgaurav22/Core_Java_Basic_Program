package check;

import java.util.Scanner;

public class Digit1_Single {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the to Check Number or Digit :");
		int n = sc.nextInt();

		if (n >= -9 && n <= 9)
			System.out.println(n + " is Digit ");
		else
			System.out.println(n + " is Number ");
		System.out.println("ThankYou!");

	}
}
