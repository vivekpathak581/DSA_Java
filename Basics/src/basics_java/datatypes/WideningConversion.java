package basics_java.datatypes;

public class WideningConversion {
    static void main(String[] args) {
        byte byteValue=12;
        short shortValue=byteValue;
        int intValue=shortValue;
        long longValue=intValue;
        float floatValue=longValue;
        double doubleValue=floatValue;
        System.out.println("ByteValue: "+byteValue);
        System.out.println("ShortValue: "+shortValue);
        System.out.println("intValue: "+intValue);
        System.out.println("longValue: "+longValue);
        System.out.println("floatValue: "+floatValue);
        System.out.println("doubleValue: "+doubleValue);
    }
}
