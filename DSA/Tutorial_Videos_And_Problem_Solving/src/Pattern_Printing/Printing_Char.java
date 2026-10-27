package Pattern_Printing;

import java.util.Scanner;

public class Printing_Char {
        static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Alphabet till you want to be printed (Should be greater than A and only a single alphabet): ");
            char c=sc.next().charAt(0); // charAt(0) is used for taking only a single character input in a variable
            System.out.print("Enter the Rows that you want to be printed: ");
            int rows=sc.nextInt();
            for (int i = 0; i < rows; i++) {
                for (char j = 'A'; j <= c; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
        }
    }
}
