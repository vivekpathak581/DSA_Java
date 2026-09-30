package Pattern_Printing;
import java.util.Scanner;
public class Star_5_3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int row=sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int col=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
