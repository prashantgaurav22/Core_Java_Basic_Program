package Method;

import java.util.Scanner;

public class ProductOfDigit 
{
 public static void main(String[] args) 
 {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter number to Find its Product: ");
	int n = sc.nextInt();
	
	int p1 = prod(n);
	System.out.println("Product of its Digit is: "+p1);
}
private static int prod(int n) 
{
	int prod = 1;
do
	{
	 int p = n%10;
	 prod = prod*p;
	 n = n/10;
	}while(n!=0);
	return prod;
}
}


