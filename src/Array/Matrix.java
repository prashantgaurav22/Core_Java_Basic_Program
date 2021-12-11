package Array;

import java.util.Scanner;

public class Matrix {
	
	int [][] readMat()
	{
	 int mat [][];
	System.out.println("Enter the order of Matrix: ");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int col = sc.nextInt();
	
	mat = new int [row][col]; // Allocate
    System.out.println("Enter"+" "+row*col+" "+"Elements: ");
	 
    for (int i = 0; i < mat.length; i++)
	 {
		for (int j = 0; j < mat[i].length; j++) 
		{
			mat[i][j] = sc.nextInt();
		}
	}
	
   return mat;
	}
	
	
	public void dispMat(int mat[][])
	{
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
			 System.out.print(mat[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	int [][] addMat(int x[][],int y[][])
	{
		if(x.length!=y.length || x[0].length!=y[0].length)
		{
			System.out.println("Not posible to Add");
			return null;
		}
		int z[][]=new int[x.length][x[0].length];
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
			  z[i][j]=x[i][j]+y[i][j];	
			}
		}
		return z;
	}
}