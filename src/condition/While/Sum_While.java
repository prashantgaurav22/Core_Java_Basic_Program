package condition.While;

import java.util.Scanner;

public class Sum_While
{
public static void main(String[] args) {

	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter the range to find sum: ");
	int n = sc.nextInt();
	int sum = 0;
	int i =0;
	while(i<=n)
	{
		sum = sum + i;
         i++;
	}
	System.out.println("Sum is: "+sum);
	
}
}
