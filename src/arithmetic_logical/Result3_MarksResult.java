package arithmetic_logical;


import java.util.Scanner;

public class Result3_MarksResult 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
    System.out.println("How many Subject maxm five: ");
    int n = sc.nextInt();
    double a[] = new double[n];
    double sum = 0;
    for (int i = 0; i<n; i++)  	
    {
       System.out.println("Enter the marks of Subject: ");
        a[i] = sc.nextDouble();
     }
  if(a[0]>=35 && a[1]>=35 && a[2]>=35 && a[3]>=35 && a[4]>=35)
    {
         for (int i = 0; i < a.length; i++) 
         {
		     sum = sum+a[i];
        	}
         System.out.println("Total marks: "+sum);
    double per = (sum/500)*100;
  if(per>=75)
	  System.out.println(per+" Percent with Distinction ");
  else if(per>=60 && per<=74)
	  System.out.println(per+" Percent with First class");
  else if(per>=36 && per<=59)
	  System.out.println(per+" Percent with Second class");
  else if(per==35)
	  System.out.println(per+"Pass");
   }   
  else if(a[0]<=35 || a[1]<=35 || a[2]<=35 || a[3]<=35 || a[4]<=35)
	  System.out.println("Fail in Subject ");
  else
	  System.out.println("Fail");
    
 
}
}