package condition.While;

import java.util.Random;
import java.util.Scanner;

public class While_Random
{
 public static void main(String[] args) 
 {
	Scanner sc  = new Scanner(System.in);
	Random rd = new Random();
	
	int count = 0;
while(true)
{
	count++;
System.out.println("Guess any number between 0 to 9: ");
   int un = sc.nextInt();
   int rn = rd.nextInt(10);
   
   if(un==rn)
   {
	   System.out.println("You have taken "+count+" chances to win the game:");
   break;
   }
   else
	   System.out.println("Sorry it was "+rn);
 
}
System.out.println("ThankYou!");
}
}
