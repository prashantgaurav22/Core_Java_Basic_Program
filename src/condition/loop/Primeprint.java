package condition.loop;
import java.util.Scanner;
public class Primeprint {
    public static void main(String[] args) {
        int i,a;
        boolean isPrime=true;
        for(a=1;a<=300;a++){
        isPrime=true;
        for(i=2;i<a;i++)
            if(a%i==0){
                isPrime=false;
        break;
            }
        if(isPrime) {   
            System.out.println(a);
        
    }
    }}
}
