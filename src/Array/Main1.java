package Array;

public class Main1
{
	public static void main(String[] args) 
	{
		
	int	t [][]= {{2,3,4},{10,20,30,45},{11,22}};
	
	System.out.println(t);
	System.out.println(t[0]);
	System.out.println(t.length);
	System.out.println(t[1].length);
	
	System.out.println(t[0][1]);
	System.out.println(t[1][0]);
	System.out.println("_ _ _ _ _ _ _ _ _");
	
	for (int i = 0; i < t.length; i++) // no. of rows
	{
		for (int j = 0; j < t[i].length; j++) // no. of elements present in each row
		{
			System.out.print(t[i][j]+" ");
		}
	System.out.println();
	}
	}
}
