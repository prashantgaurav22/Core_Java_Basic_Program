package condition.statement;public class start_pattern {
	public static void main(String[] args) {
		int n=7;
		for (int i = n; i>=1; i--) 
		{
			for (int j = 1; j<=i-1; j++) 
			{
				System.out.print(" ");
			}
			for (int k = n; k>=i; k--) 
			{
				System.out.print("*");  
			}
			System.out.println();
		}
	}
}





