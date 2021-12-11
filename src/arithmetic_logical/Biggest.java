package arithmetic_logical;
import java.util.Scanner;



public class Biggest 
{
public static void main(String[] args) {
	System.out.println("Enter any three number: ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	
	if(a>b && a>c)
		System.out.println(a+" is Biggest");
	else if(b>c)
		System.out.println(b+" is Biggest");
	else
		System.out.println(c+" is Biggest");
	
}
}
