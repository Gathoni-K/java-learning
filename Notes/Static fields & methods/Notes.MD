# Static Fields and Methods.

-Static - when something is marked using this keyword, it means that it belongs to the class itself and not to the individual objects created from the class.
non-static - each object has its own.
static - shared by entire class.
-Static members are created once and live in memory even if no objects exists.
-Instance members are created every time we create an object and live inside each object.
-If something:
    -must exist before objects.
    -must exist without objects.
    -must be shared across all objects
then it cannot be an instance member.
-Are like library rules and each book is an instance.
-Static defines what is true about the class as a whole while instance defines what is true about one specific object.
-Is a variable shared by all instances of a class.

    class Student{
        String name;
        static int schoolCount;
    }
    //name, each Student class has its own but the schoolCount is only one no matter how many students exist.

-Use when the value is global to the class or it represents the shared state.


# Static Methods.

-Belongs to the class and not to objects.

    class MathUtils{
        static int add(int a, int b){
            return a + b;
        }
    }

    Math.Utils.add(5, 7);
    //the method created above is called like this.

-Static methods cannot directly access instance members.

    class Test{
        int x = 10;

        static void printX(){
            System.out.println(x);
            //will return a compile-time error
        }
    }
    //the correct way to handle it would to make our variable x static as well, the code will then look like so:

    class Test{
        static int x = 10;

        static void Printx(Test t){
            
            System.out.println(t.x);
        }
    }

-The above code shows object access.
-This is needed when the method belongs to the class but the data it operates on belongs to a specific object.
-Used for:
1.Utility / helper methods operating on objects.
-Methods that do not belong to one object, are general operations.
2.Validation.
3.Comparison between objects.
4.Factory / creation logic.

-Is not used when the behaviour describes the object itself.
-Method depends heavily on this.
