package Array;
import java.util.Arrays;
import java.util.Scanner;

public class char_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = s.nextInt();
		char a [] = new char [n];
	     System.out.println("Enter the elements:");
	    	for (int i = 0; i < n; i++)
	    		a[i]= s.next().charAt(0);
	    	
	    	{
	    		for (int i = 0; i < a.length; i++) {
					
				
	    			
	    			System.out.println(a[i]);
	    		
	    		}
	    		System.out.println(Arrays.toString(a));
	    		
	    	
	    
		
		//String r = new String(a);
		//System.out.println(r);
		//System.out.println(r.charAt(2));
		//System.out.println(r.length());
		//System.out.println(r.startsWith());
		//System.out.println(r.toCharArray());
		//System.out.println(Arrays.toString(a));
		//System.out.println(a);}
	}
}
}
