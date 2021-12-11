package game;


import java.util.Random;
import java.util.Scanner;

public class RandomGame2 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	System.out.println("Enter any number between 10 to 19: ");
	int un = sc.nextInt();
	int rn = rd.nextInt(10)+10;
	
	if(un==rn)
		System.out.println("You won the game ");
	else
		System.out.println("Sorry You loose the game it was "+rn);
	
}
}
