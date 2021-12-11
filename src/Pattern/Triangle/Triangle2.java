package Pattern.Triangle;
import java.util.Scanner;

public class Triangle2 {


		public static void main(String[] args) {
			System.out.println("Enter the no of line: =");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int sp=n/2; 
			int st=n;
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= sp; j++) 
				{
				 System.out.print(" ");	
				}
				
				for (int j = 1; j <=st ; j++) 
				{
				 System.out.print("*");	
				}
				
				if(i<=n/2)
				{
					sp++;
					st=st-2;
				}
				else
				{
					sp--;
					st=st+2;
				}
			System.out.println();	
			}
		}

	}



