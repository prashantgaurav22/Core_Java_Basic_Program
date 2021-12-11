package check;

import java.util.Scanner;

public class EqualNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Fractional Values :");
		double x = sc.nextDouble();
		System.out.println("Enter the 1st Fractional Values :");
		double y = sc.nextDouble();

		if (x == y) {
			System.out.println("Both are Equal");
		} else
			System.out.println("Both are not Equal");
		System.out.println("ThankYou!");
	}
}
