/*
-Write a code that reads an integer, double and a string from stdin.
-Print the values with the instructions given.


*/

import java.util.*;

public class Stdin1 {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        //consumes leftover new line.
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
