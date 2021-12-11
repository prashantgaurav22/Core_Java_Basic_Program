package check;

import java.util.Scanner;

public class MiddleNumber
{
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter any three to check Middle one: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	if(a>b && a<c || a>c && a<b)
		System.out.println(a+" is Middle");
	else if(b>a && b<c || b>c && b<a)
		System.out.println(b+" is Middle");
	else
		System.out.println(c+" is Middle");
	
}

}
