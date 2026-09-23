package basics_java.oops.Inheritance;

import java.sql.SQLOutput;

class Animal{
    String eat(){
        String a6="Eating!!!!! ";
        return a6;
    }
    String sound(){
        String af="Sound is made by animal";
        return af;
    }
    void running(){
        System.out.println("Animal is running!!!! ");
    }
}
class Dog extends Animal{
    Animal a1=new Animal();
    public void bark(){
        String a2=a1.sound();
        System.out.println("Bark "+a2);
    }
    void eating(){
        String a4=a1.eat();
        System.out.println("Dog is "+a4);
    }
}
public class InheritCode {
    static void main(String[] args) {
        Dog a1=new Dog();
        a1.bark();
        a1.eating();
         a1.running();
    }
}
