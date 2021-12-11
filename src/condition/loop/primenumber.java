package condition.loop;

import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        int a, i;
        boolean isPrime = true;
        System.out.print("Enter a no. for check=");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        for (i = 2; i<a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }

        }
        if(isPrime){
            System.out.println("Prime");
        }else
            System.out.println("Not Prime");

    }
}
