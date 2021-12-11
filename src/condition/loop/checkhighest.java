package condition.loop;
import java.util.Scanner;
public class checkhighest {
    public static void main(String[] args) {
        int n,i,num,max=0,min=0;
        System.out.print("Enter the total number=");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            num=scan.nextInt();
            
            if(max<num){
                max=num;
            }
            else{
                min=num;
            }
            }
        System.out.println("max = "+max );
        System.out.println("min = "+min );

}
}