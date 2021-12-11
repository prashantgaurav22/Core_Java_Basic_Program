package check;
import java.util.Scanner;

public class DayIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Day Check :");
		int n = sc.nextInt();
		if (n == 1)
			System.out.println("Monday");
		else if (n == 2)
			System.out.println("Tuesday");
		else if (n == 3)
			System.out.println("Wednesday");
		else if (n == 4)
			System.out.println("Thrusday");
		else if (n == 5)
			System.out.println("Friday");
		else if (n == 6)
			System.out.println("Saturday");
		else if (n == 7)
			System.out.println("Sunday");
		else
			System.out.println("Day doesnot Exist");
		System.out.println("ThankYou!");

	}
}
