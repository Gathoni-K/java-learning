/*
- Given an animal class with a method walk(),
create a bird class that also has the fly() method.
-Create a Bird object that can both fly and walk


*/
import java.io.*;

public class Animal {
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

class Solution{
    public static void main(String[]args){
        Bird b1 = new Bird();
        b1.walk();
        b1.fly();
        b1.sing();
    }
}
