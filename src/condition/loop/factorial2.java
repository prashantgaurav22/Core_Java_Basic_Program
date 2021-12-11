package condition.loop;
import java.util.Scanner;
public class factorial2 {
    public static void main(String[] args) {
        int n,i,fact=1;
        System.out.print("Enter the number for factorial=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=n;i>0;i--)
        {fact=fact*i;
        System.out.println(fact);
    }}
}
