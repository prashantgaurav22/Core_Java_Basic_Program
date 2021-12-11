package Method;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number to check Prime Number or not: ");
	int n = sc.nextInt();
	boolean ps = isPrime(n);
	if(ps==true)
		System.out.println(n+" is a Prime Number.");
	else
		System.out.println(n+" is not a Prime Number.");
}
private static boolean isPrime(int num) 
{
	int i = 2;
	while(i<=num/2)
	{
	  if(num%i==0)
	   return false;
	i++;
	}	
	return true;

}
}