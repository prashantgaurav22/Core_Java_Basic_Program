package arithmetic_logical;



import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check is ArmStrong: ");
		int n = sc.nextInt();
		boolean rs = isArmStrong(n);
		if (rs == true) {
			System.out.println(n + " is Arm Strong Number.");
		} else
			System.out.println(n + " is not a Arm Strong Number.");
	}

	private static boolean isArmStrong(int n) {
		int t = n;
		int sum = 0;
		do {
			int r = n % 10;
			sum = sum + r * r * r;
			n = n / 10;

		} while (n != 0);
		return t == sum;
	}
}
