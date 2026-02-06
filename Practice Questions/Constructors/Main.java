class Student {
    int age;
    String name;

    // Constructor 1
    Student() {
        System.out.println("Student object created.");
    }

    // Constructor 2
    Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Student created with data.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();                 // constructor 1
        s1.display();

        System.out.println("-----");

        Student s2 = new Student(20, "Amina");      // constructor 2
        s2.display();
    }
}
