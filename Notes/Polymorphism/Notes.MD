# Compile-Time

- Is many methods with the same name in the same class but different parameter lists and the compiler chooses which one to run based on the arguments provided.

-Is basically method overloading.

    class Calculator{
        int add(int a, int b, int c){
            return a + b + c;
        }

        double add(double a, double b){
            return a + b;
        }
        //method overloading achieved above, same method name, but different parameter list.

        public static void main(String[]args){
            Calculator calc = new Calculator();

            calc.add(23, 67,98);
            calc.add(87.45, 99.00);
        }
    }

# Runtime.

-Happens when the JVM decides at runtime which overriden method to call.

-Is basically method overriding.

-We pass a parent reference for child objects to achieve this.

    class Animal{
        void sound(){
            System.out.println("Animal makes a sound.");
        }
    }

    class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("A dog barks.");
        }
        //method overriding
    }
    public class Main{
        public static void main(String[]args){
            Animal dog = new Dog();
            //passing a parent reference for child objects.

            dog.sound();
        }
    }