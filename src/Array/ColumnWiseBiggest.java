package Array;

public class ColumnWiseBiggest {
	public static void main(String[] args) {
		System.out.println("Enter the Matrix");
		Matrix m = new Matrix();
		int a [][] = m.readMat();
		 System.out.println("Entered Matrix ");
		m.dispMat(a);

		System.out.println("Column Wise Biggest Element");
		int c[] = columnWiseBiggest(a);
		for (int i : c) {
			System.out.println(i);
			
		}
		
		
	}

	private static int[] columnWiseBiggest(int mat [][]) {
		int big [] = new int[mat.length];
		for (int i = 0; i < mat[0].length; i++) 
		{
			big[i] = mat [0][i];
		 for (int j = 0; j < mat.length; j++) 
		 {
			if(big[i]<mat[j][i])
				big[i] = mat[j][i];
		}	
		}
		return big;
	}

}
