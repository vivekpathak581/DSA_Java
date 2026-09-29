package basics_java.oops.Overloading_And_Overriding;
class Animal{
    void sound(){
        System.out.println("Animal is making a sound!!!! ");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is braking!!!");
    }
}
class Kutta extends Dog{
    void sound(){
        System.out.println("Kutta bhonk rha hai!!!");
    }
}
public class MethodOverriding {
    static void main(String[] args) {
        Animal dog=new Dog();
        Animal kukurr=new Kutta();
        dog.sound();
        kukurr.sound();
    }
}
