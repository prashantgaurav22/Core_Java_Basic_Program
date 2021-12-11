package arithmetic_logical;

import java.util.Scanner;

public class PalindromeNumber
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check Palindrom: "); 
    int n =  sc.nextInt();
    int rev = 0;
    int t = n;
    
  do {
    	int r = n % 10;
    	rev = rev*10 + r;
    	n = n/10;
    }while(n!=0);
    
    if(t==rev) 
       System.out.println(t+" is Palindrom.");
    
    else
    	System.out.println(t+" is not a Palindrom.");
System.out.println("ThankYou!");
}

}

