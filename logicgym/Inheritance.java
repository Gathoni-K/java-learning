/*
-Create a class Vehicle with method start and prints a message.
-Create a subclass inheriting from Vehicle.
-Inside our main method, create a car object
*/


class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{}

public class Inheritance{

    public static void main (String[]args){
        Car car = new Car();
        //create a car object
        car.start();
    }
}
