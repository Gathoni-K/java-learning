/*
-Write a class Arithmetic with a method that takes 2 integers as parameters and returns an 
integer denoting their sum.
-A class names Adder inheriting from a superclass Arithmetic.
-The above classes are not public.


*/
class Arithmetic{
    public int add(int a, int b){
        int add = a + b;
        return add;
    }
}

class Adder extends Arithmetic{

}

public class Solution {
    public static void main(String[]args){
        Adder a = new Adder();

        //print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        //print the result of 3 calls to Adder's add method
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
