package condition.statement;
public class Comp_Patt
{
public static void main(String[] args) 
{
	for (int i = 1; i <= 7; i++) 
	{
	 for (int j = 1; j <=i; j++) 
	 {
		System.out.print(j+" ");
	 }
	 
	 System.out.println();
	 if(i==7)
		   {
			 for (int j2 = i-1; j2 >= 1; j2--) 
			{
			  for (int k = 1; k <=j2; k++) 
			   {
			     System.out.print(k+" ");	
			    }
			  System.out.println();
		    }
	 }
	
	}
}
}

	




