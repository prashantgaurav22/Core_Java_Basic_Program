package Pattern;

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) {
		System.out.println("Enter the no of line: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >=1; i--)
		{
		 for (int j = 1; j <=i; j++) 
		 {
		 System.out.print(j+" ");	
		}	
		 System.out.println();
		}
	}

}
