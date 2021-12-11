package condition.loop.dowhile;
import java.util.Scanner;
public class whilecontinue {
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("Enter no a=");
        a=scan.nextInt();
        System.out.print("Enter no b=");
        b=scan.nextInt();
        sum=a+b;
        System.out.println("Sum="+sum);
        System.out.println("Press 1 for continue & 2 for stop=");
            c=scan.nextInt();
            if(c!=1)
                break;
    }}
        
    }
    

