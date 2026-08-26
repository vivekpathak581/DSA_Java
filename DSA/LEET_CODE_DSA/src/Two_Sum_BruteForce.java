import java.util.*;
public class Two_Sum_BruteForce {
    public static void main(String[] args) {
        System.out.print("enter the lenght of array in numbers: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+(i+1)+" number: ");
            number[i]=sc.nextInt();
        }
        System.out.print("Enter the target you are looking for by adding two num: ");
        int target=sc.nextInt();
        boolean found= false;
        for (int j = 0; j < (number.length); j++) {
            for (int k = j+1; k < (number.length); k++) {
                if(number[j]+number[k]==target){
                    System.out.println("Numbers are at position: "+(j+1)+" and "+(k+1));
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("No two numbers add up to target");
        }
    }
}
