package basics_java.collectionframework;
import java.lang.reflect.Field;
import java.util.ArrayList;
public class DisplayingCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(34);
        list.add(58);
        list.add(46);
        list.add(92);
        list.add(100);
        list.add(102);
        list.add(58);
        list.add(27);

        

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);
        list.add(54);
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        /*

        javac basics_java/collectionframework/DisplayingCapacity.java
java --add-opens java.base/java.util=ALL-UNNAMED basics_java.collectionframework.DisplayingCapacity

         Use this command to run this code through command prompt/terminal (make sure to check the directory and use cd if needed)


        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        list.add(54);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);


         System.out.println(list.size());

        ArrayList<Integer> list = new ArrayList<>(8);

        for (int i = 1; i <= 9; i++) {
            list.add(i);
            System.out.println("Size: " + list.size()); */
    }
}
