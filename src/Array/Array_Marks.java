package Array;
import java.util.Scanner;

public class Array_Marks {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("How many Subjects:");
	int n = s.nextInt();
	int a [] = new int [n];
	for (int i = 0; i < n; i++) 
	{
	  System.out.println("Enter the marks:");
	  
	  a[i] = s.nextInt();	
	}
	int total = 0;
	for (int i = 0; i < n; i++)
	total = total+a[i];
	System.out.println("Total marks:"+total);	
    float percent;
    percent = total/n;
System.out.println("Percentage:"+percent);
}
}

