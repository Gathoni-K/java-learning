/*
-Given a class with a main method, complete the given code such that
it outputs the area of a parallelogram with breadth B and height H.
-Variables should be read from the standard input.
-If B or H is less than or equal to 0, then the output should be:
    'java.lang.Exception:Breadth and Height must be positive'
-If both values are greater than 0, then the main method must output the area of the parallelogram.
-Else print message above

*/
import java.util.Scanner;
import java.lang.Exception;

public class Static {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        //instantiate Scanner class

        int B, H;
        System.out.println("Enter the breadth of the parallelogram: ");
        B = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter height of the parallelogram: ");
        H = Integer.parseInt(scanner.nextLine());

        if (B <= 0 || H<= 0 ) {
            throw new ArithmeticException("Breadth and height must be positive.");
        }

        int area = B * H;
        System.out.println("The area is: " + area);
    }
}
