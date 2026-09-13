package basics_java.collectionframework;
import java.util.Scanner;
public class ArrayFirst {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter the length of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value at index "+i+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array value at index: "+i+" is: "+arr[i]);
        }
    }
}
