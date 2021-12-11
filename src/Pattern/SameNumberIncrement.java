package Pattern;
import java.util.Scanner;

public class SameNumberIncrement {
		public static void main(String[] args) {
			System.out.println("Enter the number of line: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for (int i = n; i >=n; i++) 
			{
				for(int j=i;j<=n;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

		

	}



