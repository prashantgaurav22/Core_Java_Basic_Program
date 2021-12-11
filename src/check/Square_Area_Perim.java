package check;


import java.util.Scanner;

public class Square_Area_Perim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side Of Square :");
		int s = sc.nextInt();

		double area = s * s;
		double peri = 4 * s;

		System.out.println("Area of Square :" + area);
		System.out.println("Perimeter of Square :" + peri);
		System.out.println("ThankYou!");
	}
}
