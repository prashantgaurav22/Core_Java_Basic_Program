package condition.While;

import java.util.Random;
import java.util.Scanner;

public class Dice_Game 
{
 public static void main(String[] args) 
 {
	Scanner sc  = new Scanner(System.in);
	Random rd  =  new Random();
	
	System.out.println("Enter 1st Player Name: ");
	String fname = sc.nextLine();
	System.out.println("Enter 2nd Player Name: ");
	String sname = sc.nextLine();
	int ftotal = 0;
	int stotal = 0;
	
while(true)
{
	System.out.println(fname+" Enter any key to flip the Dice: ");
	sc.next();
	int fn = rd.nextInt(6)+1;
	 System.out.println("Your Score is: "+fn);
	 if(ftotal+fn <= 100)
		 ftotal = ftotal+fn ;
	 System.out.println(fname+" total score is "+ftotal);
	  if(ftotal==100)
	 {
		 System.out.println(fname+" won the game");
	 break;
	 }
		
System.out.println(sname+" Enter any key to flip the Dice: ");
   sc.next();
   int sn = rd.nextInt(6)+1;
   System.out.println("Your Score is "+sn);
   if(stotal+sn<=100)
	   stotal = stotal + sn;
   System.out.println(sname+" total score is "+stotal);
    if(stotal==100)
   {
	   System.out.println(sname+" won the Game");
   break;
   }
  }
	System.out.println("ThankYou!");
}
}
