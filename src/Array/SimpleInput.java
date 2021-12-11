package Array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Elements:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++)
			a[i]=s.nextInt();
		
		{
			for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	//for(int i : a )
			//System.out.println(i);
			//System.out.println(Arrays.toString(a));
			
		
			}
		
}}


