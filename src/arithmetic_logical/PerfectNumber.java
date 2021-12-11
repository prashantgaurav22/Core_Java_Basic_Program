package arithmetic_logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Perfect or not: ");
		int n = sc.nextInt();

		boolean pn = isPerfect(n);
		if (pn == true)
			System.out.println(n + " is Perfect Number.");
		else
			System.out.println(n + " is not a perfect Number.");
	}

	private static boolean isPerfect(int x) {
		int i = 1, sum = 0;
		while (i <= x / 2) {
			if (x % i == 0)
				sum = sum + i;
			i++;
		}
		return sum == x;
	}
}
