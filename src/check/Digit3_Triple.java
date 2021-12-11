package check;

import java.util.Scanner;

public class Digit3_Triple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check :");
		int n = sc.nextInt();

		if (n > -999 && n <= -100 || n > 100 && n <= 999)
			System.out.println(n + " is a 3 Digit number");
		else
			System.out.println(n + " is not a 3 digit number");
	}
}