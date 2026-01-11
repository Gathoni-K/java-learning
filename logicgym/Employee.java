/*
-Create an abstract class Employee with:
    String name
    abstract method calculateSalary

-Create FullTimeEmployee and PartTimeEmployee where each calculates
the salary differently.
-Print the salary using polymorphism.
*/



package logicgym;

public abstract class Employee {
    String name;

    abstract double calculateSalary();

}

class FullTimeEmployee extends Employee {
    double monthlySalary = 100000;

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked = 80;
    double hourlyRate = 500;

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

//the block of code below is polymorphism.
public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}


