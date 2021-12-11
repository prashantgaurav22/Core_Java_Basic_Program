package arithmetic_logical;

import java.util.Scanner;

public class Count_Digit 
{
 public static void main(String[] args) 
 {
	System.out.println("Enter any to count the total Digit: ");
     Scanner sc  = new Scanner(System.in);
     
     int n = sc.nextInt();
     int count = 0;
     
     do
     {
    	count ++;
    	n = n/10;
     }while(n!=0);
     System.out.println("Total digit"+" is: "+count);
 }
}
