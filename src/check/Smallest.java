package check;

import java.util.Scanner;

public class Smallest
{
 public static void main(String[] args) 
 {
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter any two Number :");
  	int a = sc.nextInt();
  	int b = sc.nextInt();
  	
  if(a<b)
	  System.out.println(a+" is Smallest ");
  else
	 System.out.println(b+" is Smallest ");
  System.out.println("ThankYou!");
}
}
