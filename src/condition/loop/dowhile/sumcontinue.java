package condition.loop.dowhile;
import java.util.Scanner;
public class sumcontinue {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.print("Enter a=");
            a=scan.nextInt();
            System.out.print("Enter b=");
            b=scan.nextInt();
            sum=a+b;
            System.out.println("Sum="+sum);
            System.out.println("Press 1 for continue & 2 for stop");
            c=scan.nextInt();
        }while(c==1);
    }
}
