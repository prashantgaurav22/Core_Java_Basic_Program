package check;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Month: ");
		int mon = sc.nextInt();

		if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)

			System.out.println("There are 31 Days");
		else if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
			System.out.println("There are 30 Days");
		else if (mon == 2)
			System.out.println("There are 28 Days");
		else
			System.out.println("Month doesnot Exist");
		System.out.println("ThankYou!");
	}
}
