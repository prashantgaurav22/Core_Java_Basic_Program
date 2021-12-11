package condition.loop;
import java.util.Scanner;
public class whilesum {
    public static void main(String[] args) {
        int i=1,n,sum=0,num;
        System.out.print("Enter the total no.=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        while(i<=n){
        num=scan.nextInt();
            sum=sum+num;
            i++;}
            System.out.println(sum);
    }
    }
