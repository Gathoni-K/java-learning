/*
- Write a code that reads 3 integers from stdin and print them
out to stdout.
-Each integer to be printed on a new line.

*/

import java.util.*;

public class Stdin {

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}