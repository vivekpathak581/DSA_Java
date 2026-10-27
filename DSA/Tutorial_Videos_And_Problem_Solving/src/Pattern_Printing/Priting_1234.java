package Pattern_Printing;
import java.util.Scanner;
public class Priting_1234 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number till which you want to print pattern: ");
        int n=sc.nextInt();
        System.out.print("Enter the Rows that you want to be printed: ");
        int rows=sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
