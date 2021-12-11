package arithmetic_logical;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base: ");
		int b = sc.nextInt();
		System.out.println("Enter Power: ");
		int p = sc.nextInt();
		int pow = Power(b, p);
		System.out.println("Base " + b + " to the Power " + p + " is: " + pow);
	}

	private static int Power(int b, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * b;
			p--;
		}
		return pw;
	}
}
