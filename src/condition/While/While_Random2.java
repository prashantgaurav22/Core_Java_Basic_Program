package condition.While;

import java.util.Random;
import java.util.Scanner;

public class While_Random2 
{
public static void main(String[] args) 
{
 Scanner sc  = new Scanner(System.in);
 Random rd = new Random();
 int count = 0;
 int rn = rd.nextInt(100);
 
 while(true)
 {
	 count ++;
	System.out.println("Guess any number between 0 to 99: ");
	int un = sc.nextInt();
	
	
	if(un==rn)
	{
		System.out.println("You have taken "+count+" chance to won the game:");
		break;
	}
	else if(un>rn)
		System.out.println("Your guess number is too high:");
		else
			System.out.println("Your guess number is too low:");
}
 System.out.println("ThankYou!");
}
}