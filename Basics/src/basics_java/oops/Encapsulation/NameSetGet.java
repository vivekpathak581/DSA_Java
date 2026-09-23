package basics_java.oops.Encapsulation;
class Student{
    private String Name;

    public void set(String Name){
        this.Name=Name;
    }
    public String get(){
        return Name;
    }
}
public class NameSetGet {
    static void main(String[] args) {
        Student s1=new Student();
        s1.set("Vivek");
        s1.get();
    }
}
