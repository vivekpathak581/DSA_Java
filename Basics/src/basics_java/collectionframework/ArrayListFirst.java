package basics_java.collectionframework;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFirst {
    static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(49);
        arraylist.add(65);
        arraylist.add(43);
        arraylist.add(29);
        System.out.println(arraylist.get(0));

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println("Value at index "+i+" is: "+arraylist.get(i));
        }
    }
}
