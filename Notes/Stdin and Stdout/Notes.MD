# Stdin class.

-Class for reading input.
-A popular way of reading input from stdin is by using Scanner class and specifying input stream as 'System.in' e.g.:

    Scanner scanner = new Scanner(System.in);
    String myString = scanner.next();
    int myInt = scanner.nextInt();
    scanner.close();

    System.out.println("My string is:" + myString);

**Scanner Class.**
-Is available in the 'java.util' package therefore must be imported using:

    import java.util.*;

**Steps to use Scanner Class to Take Input.**
1.Import the class from the package, this should be the first line.
2.Create the object of the Scanner class:

    Scanner scan = new Scanner(System.in);

3.Create a variable using scanner class object, call the corresponding method to take the input value.

    int var1 = scan.nextRequiredMethod();

    //required methods include:
    nextBoolean()
    nextByte() - read byte value.
    nextDouble()
    nextFloat()
    nextInt()
    nextLine() - reads a line value
    //this method is a bit special, so in the case that other methods have been used, before using this one, include the line beloe:

        scan.nextLine();
        //consumes the whitespace ensuring that we do not read an empty line

    nextLong()
    nextShort()

4.Close the scanner object using:

    scan.close();

# Stdout class.
-Is where our output is written.
