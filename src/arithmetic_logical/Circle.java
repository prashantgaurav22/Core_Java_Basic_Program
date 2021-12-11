package arithmetic_logical;
import java.util.Scanner;

public class Circle 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Radius of the Circle:");
	int r=sc.nextInt();
	double area = 3.14*r;
	System.out.println("Area of Circle "+area);
}
}
