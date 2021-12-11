package arithmetic_logical;
import java.util.Scanner;

public class Bmi
{
 public static void main(String[] args) {
	Scanner sc  =new Scanner(System.in);
	
	System.out.println("Enter the Height Of Man :");
	float h=sc.nextFloat();
	System.out.println("Enter the Weight Of Man :");
	float w=sc.nextFloat();
	double bmi=w/(h*h);
	 
	System.out.println("The BMI of Man is :"+bmi);
	
	
}
}
