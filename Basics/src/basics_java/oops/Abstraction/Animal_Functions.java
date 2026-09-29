package basics_java.oops.Abstraction;

abstract class Animal{
    abstract void sayHello();
    abstract void shakeHand();
    String sleep(){
        String abc="zzzzzzz...zzzzzzz..zzzzzzz";
        return abc;
    }
}

class Dog extends Animal{
    void sayHello(){
        System.out.println("Dog is making sound: Wooff woofff");
    }

    void shakeHand(){
        System.out.println("Dog is shaking hand");
    }
}

class Cat extends Animal{
    void sayHello(){
        System.out.println("Cat is making sound: Meooww Meoowww");
    }

    void shakeHand(){
        System.out.println("Cat is shaking hand");
    }
}

class Lion extends Animal{
    void sayHello(){
        System.out.println("Dog is making roaring sound!!! ");
    }

    void shakeHand(){
        System.out.println("Lion is shaking hand and can grab you by neck, beware!!!! ");
    }
}

public class Animal_Functions {
    static void main(String[] args) {
        Dog dg=new Dog();
        Cat ct=new Cat();
        Lion ln=new Lion();
        dg.sayHello();
        dg.shakeHand();
        System.out.println("Dog is sleeping and making sound like: "+dg.sleep());
        System.out.println(" ");
        ct.sayHello();
        ct.shakeHand();
        System.out.println("Cat is sleeping and making sound like: "+ct.sleep());
        System.out.println(" ");
        ln.sayHello();
        ln.shakeHand();
        System.out.println("Lion is sleeping and making sound like: "+ln.sleep());

    }
}
