package condition.loop;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int a,i=2;
        System.out.println("Enter a number for check=");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        while(a%i==0){
            System.out.println("no is even");
    }
    }
}
