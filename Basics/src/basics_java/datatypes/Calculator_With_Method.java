package basics_java.datatypes;
class Calcu{
    // private int n,m;
//    Calcu(){          //Constructor
//        this.n=n;
//        this.m=m;
//    }
    int add(int n, int m){
        return (n+m);
    }
    int sub(int n, int m){
        return n-m;
    }
    int mul(int n, int m){
        return n*m;
    }
    int div(int n, int m){
        return n/m;
    }
    int mod(int n, int m){
        return n%m;
    }
}
public class Calculator_With_Method {
    public static void main(String[] args) {
        Calcu c=new Calcu();
        System.out.println("Addition of two number are: "+c.add(20,60));
        System.out.println("Subtraction of two number are: "+c.sub(90,50));
        System.out.println("Multiplication of two number are: "+c.mul(20,90));
        System.out.println("Division of two number are: "+c.div(90,7));
        System.out.println("Modulas of two number are: "+c.mod(45,2));
    }
}
