package condition.Do_While;

import java.util.Scanner;

public class Prod_Even_Odd 
{
public static void main(String[] args) 
{
  Scanner sc  = new Scanner(System.in);	
   System.out.println("Enter any number to find its Even/Odd Product: ");
     int n = sc.nextInt();
     int evenprod = 1;
     int oddprod  = 1;
     
     do {
    	 int r = n % 10;
    	 n = n/10;
    	 
    	 if(r%2==0)
    		 evenprod = evenprod*r;    		 
    	 else 
    		 oddprod = oddprod*r;
          	 
     }while(n!=0);
     
     System.out.println("Even Digit Product: "+evenprod);
     System.out.println("Odd Digit Product: "+oddprod);
System.out.println("ThankYou");
}
}
