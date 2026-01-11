# Abstract class.

-Is a class declared using the abstract keyword.
-A class that cannot be instantiated, a direct object cannot be created using the new keyword.
-It works as a base class for subclasses.

    abstract class Book{
        String title;

        abstract void setTitle(String s){
            String getTitle(){
                return title;
            }
        }
    }

    Book novel = new Book();
    //this line will produce an error.

-The above block of code is wrong, violates the rule of an abstract method not having a body, this is what it should look like instead:

    abstract class Book {
    String title;
    
    abstract void setTitle(String s);  
    // No body - just a semicolon
    
    String getTitle() {  
        // Concrete method at class level
        return title;
    }
    }

-In order to order to create an object, a new class must be created that extends the abstract class.

-Then an instance can be created of the new class.

-In the above example, the setTitle() method is also abstract and must thus be implemented in the child class.
