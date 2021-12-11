package condition.loop.dowhile;
import java.util.Scanner;
public class pressfor {
    public static void main(String[] args) {
        int i,a,num,sum=0;
        Scanner scan=new Scanner(System.in);
        for (;true;){ 
            System.out.print("Enter a number=");
            num=scan.nextInt();
            sum=num+sum;
            
            if(num==0){
                break;
            }
        }
            System.out.println("Sum="+sum);
            
        }
    }
