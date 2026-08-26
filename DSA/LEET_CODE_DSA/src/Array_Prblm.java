import java.util.*;
public class Array_Prblm {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(("enter a number that you want as length of array: " ));
        int n=sc.nextInt();
        int [] number= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" first ");
            number[i]=sc.nextInt();

        }
    }
}
