package Array;
import java.util.Scanner;

public class Sum2 {

public static void main(String[] args) {
	System.out.println("Enter the total number size:");
	Scanner s = new Scanner(System.in);
	int sum = 0;
	int n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the number:");
	for (int i = 0; i < n; i++) 
	
		a[i] = s.nextInt();
	
			for(int i=0;i<n;i++)
		
    sum = sum + a[i];
     System.out.println(sum);
}
}



