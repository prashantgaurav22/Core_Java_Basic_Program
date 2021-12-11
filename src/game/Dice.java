package game;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Enter the 1st player name: ");
		String fname = sc.nextLine();
		int fn = rd.nextInt(6) + 1;

		System.out.println("Enter the 2nd player name: ");
		String sname = sc.nextLine();
		int sn = rd.nextInt(6) + 1;

		if (fn == sn)
			System.out.println("Match Draw");
		else if (fn > sn)
			System.out.println(fname + " won the game and score is: " + fn);
		else
			System.out.println(sname + " won the game and score is: " + sn);
	}
}
