package Logical.For;

import java.util.Scanner;

public class Table 
{
 public static void main(String[] args) 
 {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter any number to find their Table: ");
	int n = sc.nextInt();
	for (int i = 1; i <= 10; i++)
	{
		System.out.println(n+" * "+i+" = "+n*i);
	}
}
}
