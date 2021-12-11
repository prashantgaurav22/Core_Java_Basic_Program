package condition.Do_While;

import java.util.Scanner;

public class Sum_Even_Odd 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any to find Sum of its Digit:  ");
	int n = sc.nextInt();
	int evensum = 0;
	int oddsum = 0;
	
	do
	{
		int r = n%10;
		 if(r%2==0) 
		  
			evensum = evensum + r;
		  
		 else
			 oddsum = oddsum + r;
		 
		 n = n/10;
	}while(n!=0);
	
	System.out.println("Even Digit Sum is: "+evensum);
	System.out.println("Odd Digit Sum is: "+oddsum);
}
}
