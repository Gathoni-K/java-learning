/*
-Create a class Animal with a method sound() that prints a message.
-Create a class Dog that extends Animal.
-Override sound in Dog to print 'Dog barks'
-In our main method, create an Animal reference pointing to 
a Dog object.
-call sound.
*/
class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Inheritance1 {
    public static void main(String[]args){
        Animal d = new Dog();
        d.sound();
    }
}
