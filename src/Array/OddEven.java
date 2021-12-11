package Array;


public class OddEven {
	
	public int[] countEO(int mat [][])
	{
		int count[]= {0,0};
		for (int i = 0; i < mat.length; i++) 
		{ 
			for (int j = 0; j < mat[i].length; j++) 
			{
			  count[mat [i][j]%2]++;
			  
			}
		}
		return count;
	}
 public static void main(String[] args) {
		Matrix mt = new Matrix();
	
		System.out.println("Enter the Matrix");
		int a [][]= mt.readMat();
		
		System.out.println("Entered Matrix");
		mt.dispMat(a);
		
		System.out.println("Total Even Odd");
		OddEven oe = new OddEven();
		 int c[]= oe.countEO(a);

		 
		 for (int i : c) {
			 System.out.println(i);

		
		
		 }
	}
	}
