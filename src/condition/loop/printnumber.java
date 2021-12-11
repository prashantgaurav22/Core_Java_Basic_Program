package condition.loop;
import java.util.Scanner;
public class printnumber {
    public static void main(String[] args) {
        int i,n;
        System.out.print("Enter the no. of term=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++)
            System.out.println(i);
    }
    
}
