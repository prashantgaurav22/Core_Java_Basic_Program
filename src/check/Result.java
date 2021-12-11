package check;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Percentage :");
		double pr = sc.nextDouble();

		if (pr >= 85)
			System.out.println("Distinction");
		else if (pr > 60)
			System.out.println("First Division");
		else if (pr > 50)
			System.out.println("Second Division");
		else if (pr > 30)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		System.out.println("ThankYou!");
	}
}
