package condition.loop;
import java.util.Scanner;
public class reverseprint {
    public static void main(String[] args) {
    int n,i;
        System.out.print("Enter the term=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=n;i>0;i--)
        System.out.println(i);
    }   
}
