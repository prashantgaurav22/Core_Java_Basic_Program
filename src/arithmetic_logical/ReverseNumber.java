package arithmetic_logical;

import java.util.Scanner;

public class ReverseNumber 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
  System.out.println("Enter any to Reverse: ");
  int n = sc.nextInt();
  int rev = 0;
  
  do
  {
	  int r = n%10;
	  rev = rev*10 + r;
	  n = n/10;
  }while(n!=0);
  
	System.out.println("Reverse of this number is: "+rev);
}
}
