package basics_java.datatypes;
class Constructor {

//    private int num1, num2;

    Constructor(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }

    Constructor(int num1, int num2, int num3) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    Constructor(double num1, double num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    Constructor(int num1, double num2) {
        System.out.println("Division: " + (num1 / num2));
    }
    Constructor(int num1, float num2){
        System.out.println("Modulas: "+(num1%num2));
    }
}
public class Calculator_With_Constructor {
    public static void main(String[] args) {
        Constructor add = new Constructor(3,5);
        Constructor sub = new Constructor(5,2,6);
        Constructor mul = new Constructor(3.0,5.0);
        Constructor div = new Constructor(3,2.0d);
        Constructor mod = new Constructor(22,11.0f);
    }
}
