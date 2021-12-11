package check;
import java.util.Scanner;

public class Smallest2 
{
public static void main(String[] args) 
{
	Scanner sc  = new Scanner(System.in);
System.out.println("Enter the three number :");
int a = sc.nextInt();
int b = sc.nextInt();
int c  =sc.nextInt();

if(a<b  &&  a<c)
	System.out.println(a+" is Smallest");
else if(b<c)
	System.out.println(b+" is Smallest");
else
	System.out.println(c+" is Smallest");
System.out.println("ThankYou!");
	
}
}
