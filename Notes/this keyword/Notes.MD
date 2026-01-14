# Java `this` Keyword Notes

## 1. What is `this`?

- `this` is a **reference to the current object**.
- It refers to the **object that is calling the method or constructor**.
- Helps **differentiate instance variables from local variables** when they have the same name.

---

## 2. Basic Syntax


    class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name; // 'this' resolves ambiguity
            this.age = age;
        }
    }

---

## 3.Uses of this.

**1. Referring to instance variables.**

    this.variableName = parameterName;

    class Student{
        int id;
        String name;

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        void display(){
            System.out.println("The student's name is: " + name + " " + id );
        }

        public class Print{
            public static void main(String[]args){
                Student s1 = new Student(234, "Jill");

                //arguments need to be passed to our object

                /*
                -Arguments are passed to the constructor depending on the constructor, if it is a no-argument constructor, i.e. does not have any parameters, then we can create the object as usual.
                */

                s1.display();
            }
        }
    }

**2. Calling another constructor in the same class.**

-Used to avoid code duplication.
-Must be the first statement in the constructor.

    class User{
        String name;
        int age;

        User(){
            this("Guest", 0);
        }

        User(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

**3.Passing current object as a parameter.**

-Useful for callbacks, event handling or linking objects.

    class Engine{
        void start(Car car){
            System.out.println("Engine started for " + car.name);
        }
    }

    class Car{
        String name;
        Engine e = new Engine();

        Car(String name){
            this.name = name;
        }
    

    void startCar(){
        e.start(this)
    }
    }

-This cannot be used inside static methods, as static methods do not belong to any instance so no current object exists.
-The keyword must be the first in line in constructor.
-Can be used to pass the current object to methods or other objects.
-Is used to refer to current object of the class and to distinguish instance variables from local variables, call other constructors.




