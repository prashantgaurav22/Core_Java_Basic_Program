package condition.While;

import java.util.Scanner;

public class Loop_Range 
{
 public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter the range: ");
	int n = sc.nextInt();
	
	while(n>0)
	{
		System.out.println(n);
		n--;
	}
}
}
