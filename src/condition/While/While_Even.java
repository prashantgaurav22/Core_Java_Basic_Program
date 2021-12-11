package condition.While;

import java.util.Scanner;

public class While_Even 
{
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter range to find Even Number: ");
	int n = sc.nextInt();
	int i = 0;
	while(i<=n)
	{
		System.out.println(i);
		i=i+2;
	}
	
}
}
