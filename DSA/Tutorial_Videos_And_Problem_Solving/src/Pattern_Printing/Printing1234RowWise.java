package Pattern_Printing;
import java.util.Scanner;
public class Printing1234RowWise {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number(>1)&(<10): ");
        int n=sc.nextInt();
        while( n<=1 || n>=10 ){
            System.out.print("Please enter a number that is (>1) & (<10): ");
            n=sc.nextInt();
        }
//        while(n>=10){
//            System.out.print("Please enter a number that is (<10): ");
//            n=sc.nextInt();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
