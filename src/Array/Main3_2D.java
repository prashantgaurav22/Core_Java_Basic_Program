package Array;

import java.util.Scanner;

public class Main3_2D {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int mat [][];
	
	System.out.println("Enter the order of Matrix : ");
	int row = sc.nextInt();
	int col = sc.nextInt();
	
	int mat[][]= new int [row][col]; // Allocate
	 
	 System.out.println("Enter"+" "+row*col+" "+"Elements: ");
	 
	 for (int i = 0; i < mat.length; i++)
	 {
		for (int j = 0; j < mat[i].length; j++) 
		{
			mat[i][j] = sc.nextInt();
		}
	}
	 System.out.println("Entered Elements");
	 for (int i = 0; i < mat.length; i++) 
	 {
		 for (int j = 0; j < mat[i].length; j++)
		 {
			 System.out.print(mat[i][j]+" ");
		}
		 System.out.println();
			}
}

}
