package arithmetic_logical;

import java.util.Scanner;

public class PerfectNumberUpto1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 1000; i++) {
			boolean pn = isPerfect(i);
			if (pn == true)
				System.out.println(i);
		}
	}

	private static boolean isPerfect(int x) {
		int i = 1;
		int sum = 0;
		while (i <= x / 2) {
			if (x % i == 0)
				sum = sum + i;
			i++;
		}
		return sum == x;
	}
}
