package condition.loop;
import java.util.Scanner;
public class whilefactorial {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.print("Enter the number for Factorial=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        while(n>1){
            fact=n*fact;
            System.out.println(fact);
            n--;
        }
    }
}