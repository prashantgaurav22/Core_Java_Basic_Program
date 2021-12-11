package Array;

import java.util.Scanner;

public class RowWiseBiggest {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Matrix");
		
		Matrix m = new Matrix();
		int a[][] =  m.readMat();
		
		System.out.println("Entered Matrix is");
        m.dispMat(a);
        int b[] = rowWiseBiggest(a);
        
        System.out.println("Row Wise Biggest Element");
        for (int i : b) {
        	System.out.println(i);
			
		}
	}
	private static int[] rowWiseBiggest(int mat [][] )
	{
		int big [] = new int[mat.length];
		for (int i = 0; i < mat.length; i++)
		{
			big[i] = mat[i][0];
			for (int j = 0; j < mat[i].length; j++)
			{
				if(big [i] < mat [i][j])
                   big[i] = mat[i][j];

			}
		}
		return big;
	}}