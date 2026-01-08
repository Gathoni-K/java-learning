# Inheritance.

-Is when a chid object acquires all the properties of the parent class.

-Method overriding is a core concept in Java.

**Method Overriding**

-Is when a subclass provides a specific implementation for a method already defined in its parent class.
-The overridden method in subclass must have the same name, parameters and return type as the method in the parent class.

**Rules for method overriding**
1.Name, parameters and return type must match the parent method.
2.Java picks which method to run at run time based on the actual object type and not just the reference variable type.
3.Static method cannot be overridden.
4.The '@Override' annotation catches mistakes like typos in method names.


    class Animal{
        void move(){
            System.out.println("Animal is moving");
        }
        void eat(){
            System.out.println("Animal is eating");
        }
    }
    class Dog extends Animal{
        @Override
        void move(){
            System.out.println("Dog is running.");
            //move method from parent class is overridden in this method.
        }
        void bark(){
            System.out.println("Dog is barking");
        }
    }
    
    public class Geeks{
        public static void main(String[]args) {
            Dog d = new Dog();
            d.move();
            d.eat();
            d.bark();
        }
    }
