package condition.Do_While;

import java.util.Scanner;

public class Digit_Sum 
{
 public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any to find the Sum of its Digit: ");
	int n = sc.nextInt();
	int sum = 0;
	
	do {
		 int r = n%10;
		 sum = sum+r;
       	n = n/10;
	}while(n!=0);
	
    	System.out.println("Sum of its Digit is: "+sum);
}
 
}
