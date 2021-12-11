package Array;

public class Main2 {
	public static void main(String[] args) {
		
		int mat[][]; // Declaration
		
		mat = new int [3][4]; // allocation
   
		mat[0][2] = 56;
		mat[1][1] = 67; // Initialization	
		mat[2][2] = 54;
		
		for (int i = 0; i < mat.length; i++) // no. of rows
		{
			for (int j = 0; j < mat[i].length; j++) // no of elements in ith row 
			{
			 System.out.print(mat[i][j]+" "); // accessing
			}
			System.out.println();
		}
	}

}
