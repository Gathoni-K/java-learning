/*
-Block of code demonstrating calling another constructor using the this keyword
*/

public class User {
    String name;
    int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    // User(){
    //     name = "Guest";
    //     age = 0;
    // }
    User(){
        this("Guest", 0);
    }

    // User(String name){
    //     this.name = name;
    //     age = 0;
    // }

    User(String name){
        this(name, 30);
    }
    //cpnstrucotr where default age is given


    void display(){
        System.out.println("THe user's name is: " + name + " " + age);
    }


}
