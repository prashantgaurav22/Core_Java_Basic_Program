package Array;

public class Addmatrix 
{
	public static void main(String[] args) 
	{
		Matrix mt = new Matrix();
		System.out.println("Enter the First Matrix");
		 int a[][] = mt.readMat();
	    System.out.println("Enter Second Matrix");
	     int b [][] = mt.readMat();
	      
	     System.out.println("Entered First Matrix");
	      mt.dispMat(a);
	     System.out.println("Entered Second Matrix");
	      mt.dispMat(b);
	      
	      int c[][]=mt.addMat(a, b);
	      if(c==null)
	    	  System.out.println("Addition is Failed");
	      else
	      {
    
	     System.out.println("New Added Matrix is: ");
	     mt.dispMat(c);
	      
  }
 }
}
