package basics_java.datatypes;

public class NarrowingConversion {
   public static void main(String[] args) {
       double doubleValue=12.585889985548698;
       float floatValue=(float)doubleValue;
       int intValue=(int)floatValue;
       short shortValue=(short)intValue;
       byte byteValue=(byte)shortValue;
       System.out.println(doubleValue);
       System.out.println(floatValue);
       System.out.println(intValue);
       System.out.println(shortValue);
       System.out.println(byteValue);
    }
}
