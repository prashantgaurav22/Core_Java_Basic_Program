package arithmetic_logical;
import java.util.Scanner;

public class Digit_Prod 
{

public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter any to find Product of its digit: ");
	int n = sc.nextInt();
	int prod = 1;
	do {
		int p = n%10;
		 prod = prod*p;
		 n= n/10;
	}while(n!=0);
	System.out.println("Product of its digit is: "+prod);
	
	
}
}
