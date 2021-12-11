package condition.Do_While;

import java.util.Scanner;

public class Digit_Sqr_Sum 
{
 public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter any number to find Sqr sum of its Digit: ");
	int n = sc.nextInt();
	int sum = 0;
	
	do {
		int r  = n%10;
		sum = sum+r*r;
		n=n/10;
	}while(n!=0);
	
	System.out.println("Sum of its sqr digit is: "+sum);
	
}
}
