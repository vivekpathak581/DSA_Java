package Pattern_Printing;

public class AlphabetPrintingByTypecasting {
    static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if(i%2!=0) {
                for (int j = 1; j <= 4; j++) { //we can use j value as 65
                    System.out.print(Character.toLowerCase((char) (i + 64)) + " "); //using Character.toLowerCase we print small alphabets
                }
            }
            else {  // else if(i%2==0)
                for (int j = 1; j <= 4; j++) { //we can use j value as 65
                    System.out.print((char)(i + 64) + " "); //using Character.toLowerCase we print small alphabets
                }
            }
            System.out.println();
        }
    }
}
