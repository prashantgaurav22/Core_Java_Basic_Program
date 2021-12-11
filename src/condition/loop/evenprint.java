package condition.loop;
import java.util.Scanner;
public class evenprint {
    public static void main(String[] args) {
        int n,i,even;
        System.out.print("Enter the last term for print=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++)
            if(i%2==0)
            System.out.println(i);
    }
    
}
