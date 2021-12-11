package condition.loop.dowhile;
import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner scan=new Scanner(System.in);
        do{
            System.out.print("Enter a number=");
            num = scan.nextInt();
            sum=num+sum;
        }
        while(num!=0);
        System.out.println("Sum="+sum);
                
        }
    }
   
