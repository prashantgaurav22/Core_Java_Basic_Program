package game;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 0 to 9 :");
		int un = sc.nextInt();

		Random rn = new Random(10);
		int rd = rn.nextInt();

		if (un == rd)
			System.out.println("You won the Game");
		else
			System.out.println("You loose the Game");
		System.out.println("ThankYou!");

	}

}
