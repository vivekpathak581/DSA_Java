package basics_java.oops;
class Car{
//    int carNo;
//    int speed;
//    String Model;
//    String color;

    void drive(String carNo, int speed, String model, String color){
        System.out.println(model+" of "+color+" color is running at speed of "+speed+" and it's car number is "+carNo);
    }
}
public class FirstClass {
    static void main(String[] args) {
        Car c1=new Car();
//        c1.carNo=5875;
//        c1.speed=200;
//        c1.Model="RollsRoyce";
//        c1.color="Red";
//        c1.drive();
        c1.drive("UK18BC0581", 200, "RollsRoyce", "Red");
    }
}
