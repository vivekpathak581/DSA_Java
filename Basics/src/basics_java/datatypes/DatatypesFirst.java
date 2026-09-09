package basics_java.datatypes;

public class DatatypesFirst {
    public static void main(String[] args){
        int n=30;
        char ba='a';
        String Bca="Hello Bca";
        float bcrd=56.67f;
        double db=54.32587;
        double dc= bcrd+db;
        System.out.println(dc);
        System.out.println("Minimum value of short=> "+ Short.MIN_VALUE);
        System.out.println("Maximum value of short=> "+ Short.MAX_VALUE);
        System.out.println("Minimum value of int=> "+ Integer.MIN_VALUE);
        System.out.println("Maximum value of int=> "+ Integer.MAX_VALUE);
        System.out.println("Maximum value of float=> "+ Float.MAX_VALUE);
        System.out.println("Minimum value of float=> "+ Float.MIN_VALUE);
        System.out.println("Maximum value of double=> "+ Double.MAX_VALUE);
        System.out.println("Minimum value of double=> "+ Double.MIN_VALUE);
        System.out.println("Maximum value of long=> "+ Long.MAX_VALUE);
        System.out.println("Minimum value of long=> "+ Long.MIN_VALUE);
        System.out.println("Maximum value of Character=> "+ (int) Character.MAX_VALUE);
        System.out.println("Minimum value of Character=> "+ (int) Character.MIN_VALUE);
    }
}
