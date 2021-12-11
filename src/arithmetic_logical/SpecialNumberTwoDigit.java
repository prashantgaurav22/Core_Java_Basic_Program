package Method;

import java.util.Scanner;

public class SpecialNumberTwoDigit 
{
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter any two Digit Number to Check: ");
	int n = sc.nextInt();
	boolean rs = isSpecial(n);
	
	if(rs==true)
		System.out.println(n+" is Special two Digit Number:");
	else
		System.out.println(n+" is not Special two Digit Number:");
}
private static boolean isSpecial(int num) 
{
	int x = num/10;
	int y = num%10;
	
	int sum = (x+y) + (x*y);
	return sum==num;
}
}
