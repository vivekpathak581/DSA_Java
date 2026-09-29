package basics_java.oops.Overloading_And_Overriding;

class Student {
    String name;
    int rollNo;
    int marks;

    // Default constructor (no parameters)
    Student() {
        name = "Unknown";
        rollNo = 0;
        marks = 0;
    }

    // Parameterized constructor (2 parameters)
    Student(String n, int r) {
        name = n;
        rollNo = r;
        marks = 0; // default marks
    }

    // Parameterized constructor (3 parameters)
    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

public class ConstructorRole {
    public static void main(String[] args) {
        // Using different constructors
        Student s1 = new Student();                     // calls default constructor
        Student s2 = new Student("Vivek", 101);         // calls 2-parameter constructor
        Student s3 = new Student("Rahul", 102, 90);     // calls 3-parameter constructor

        s1.display();  // Name: Unknown, Roll No: 0, Marks: 0
        s2.display();  // Name: Vivek, Roll No: 101, Marks: 0
        s3.display();  // Name: Rahul, Roll No: 102, Marks: 90
    }
}

