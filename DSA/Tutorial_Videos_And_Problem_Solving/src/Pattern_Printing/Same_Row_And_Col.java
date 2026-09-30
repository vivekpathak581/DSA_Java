package Pattern_Printing;
import java.util.Scanner;
public class Same_Row_And_Col {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number from which same row and col will be printed: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
