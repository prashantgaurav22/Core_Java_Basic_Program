package Array;

import java.util.Scanner;

public class PositiveNegative {
	
	public static int[] CountPN(int mat [][]) 
	{
	 int count[]= {0,0};
	 for (int i = 0; i < mat.length; i++) 
	 {
	   for (int j = 0; j < mat[i].length; j++) 
	   {
		   if(mat [i][j]>=0)
			   count [0]++;
		   
		   else 
			   count [1] ++;
	}	
	}
	return count;
	}
	
	public static void main(String[] args) {

	System.out.println("Enter the matrix First");
	
	Matrix m = new Matrix();
	int a[][] = m.readMat();
	
	System.out.println("Entered Matrix ");
	m.dispMat(a);
	
	int n[] = CountPN(a);
	
	System.out.println("Positive And Negative number's are: ");
	for (int i : n) {
		System.out.println(i);
			}
	}
}

