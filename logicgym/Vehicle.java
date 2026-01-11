/*
-Create an abstract class Vehicle with:
    field - speed
    abstract method move
    concrete method setSpeed(int a)

-create a class Car implementing move().

*/


package logicgym;

public abstract class Vehicle {
    protected int speed;
    //make it protected such that subclasses can safely access it.
    
    abstract void move();

    void setSpeed(int a){
        speed = a;
    }

}

class Car extends Vehicle{
    void move(){
        System.out.println("The car is moving at " + speed);
    }
}
