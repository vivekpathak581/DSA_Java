package basics_java.control_flow;
import java.io.*;
import java.util.*;
public class Table_Correct {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 2; j <= 20; j++) {

                int table = i * j;

                System.out.printf("%-20s",j + " * " + i + " = " + table + "   "); // this "%-20s" prints the spaces between the tables properly.
            }

            System.out.println();
        }
    }
}