package Pattern.Modulus;

import java.util.Scanner;

public class Modulus {
	public static void main(String[] args) {
		System.out.println("Enter the number line: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
	}

}
