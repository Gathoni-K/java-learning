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


## Types of Inheritance.

**1. Hierarchical**
- One parent class, many sub-classes.

    class Animal{
        void sound(){
            System.out.println("Animal makes a sound.");
        }
    }
    class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("A dog barks");
        }
    }

    class Donkey extends Animal{
        @Override
        void sound(){
            System.out.println("A donkey neighs");
        }
    }

    public class Print{
        public static void main(String[]args){
            //runtime-time polymorphism is achieved below
            Animal dog = new Dog();
            Animal donkey = new Donkey();

            dog.sound();
            donkey.sound();
        }
    }

**2. Multilevel**
-One parent class, one child, one grandchild, i.e. one subclass inherits from another subclass and so on.

-Each level adds more specific behaviour.

-Used when one wants to model a is-a(parent-child) relationship that form a chain.

-Lower classes inherit methods/properties from all ancestors.


**3. Multiple.**
-One child, multiple parents.

-This cannot be achieved using classes.

-Is supported through interfaces instead.

    interface Flyable{
        void fly();
    }

    interface Swimmable{
        void swim();
    }

    class Duck implements Flyable, Swimmable{
        public void fly(){
            System.out.println("Duck flies");
        }

        public void swim(){
            System.out.println("Duck swims");
        }
    }

    

