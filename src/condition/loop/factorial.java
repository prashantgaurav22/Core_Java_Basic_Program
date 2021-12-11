package condition.loop;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.print("Enter the term=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            int num=scan.nextInt();
            sum=sum+num;
        }
        System.out.println("Sum="+sum);
    }
}
            
        