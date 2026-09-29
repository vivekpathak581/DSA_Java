package basics_java.datatypes;

    class Calculator {

        private double num1;
        private double num2;

        // Constructor
        Calculator(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        void addition() {
            System.out.println("Addition: " + (num1 + num2));
        }

        void subtraction() {
            System.out.println("Subtraction: " + (num1 - num2));
        }

        void multiplication() {
            System.out.println("Multiplication: " + (num1 * num2));
        }

        void division() {
            System.out.println("Division: " + (num1 / num2));
        }

        void modulus() {
            System.out.println("Modulus: " + (num1 % num2));
        }
    }

    public class Calculator_With_Method_And_Constructor {

        public static void main(String[] args) {

            Calculator calc = new Calculator(22, 11);

            calc.addition();
            calc.subtraction();
            calc.multiplication();
            calc.division();
            calc.modulus();
        }
    }
