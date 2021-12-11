package condition.loop.dowhile;

import java.util.Scanner;

public class press0 {

    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number=");
            num = scan.nextInt();
            sum = num + sum;
            
            if (num == 0){
                break;
            }
        }

            System.out.println("Total="+sum);
        
    }
}
