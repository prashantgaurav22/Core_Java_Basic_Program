package arithmetic_logical;

import java.util.Scanner;

public class FactorialSum 
{
public static void main(String[] args) 
{
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to Find Sum of Fatorial of Digit: ");
     int n = sc.nextInt();
     int sum = 0;
     
     while(n!=0)
    	 {   
    		 int fact = 1;
    		 int r = n%10;
    		 
    		   for(int i =r;i>=1;i--)
    		   {
    			 fact = fact*i;
    		    }
    		   sum = sum + fact;
    		   n = n/10;
    		   
    	 }  
    	 
    	 System.out.println("Sum of Factorial of Each Digit is: "+sum);
 
}
}
