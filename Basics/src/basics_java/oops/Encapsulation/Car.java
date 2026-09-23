package basics_java.oops.Encapsulation;

public class Car {
    private int speed;
    private String color;

    public Car(String color){
        this.color=color;
    }

    public void setSpeed(int speed){
        if (speed<0){
            System.out.println("Not possible!!");
        }
        else{
            this.speed=speed;
            System.out.println("Speed of car is: "+speed+" and Color of car is: "+color);
        }
    }
}
