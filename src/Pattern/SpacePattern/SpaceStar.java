package Pattern.SpacePattern;

import java.util.Scanner;

public class SpaceStar {

	public static void main(String[] args) {
		System.out.println("Enter the no: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
