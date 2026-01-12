/*


*/

public class Calculator {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[]args){
        Calculator obj = new Calculator();

        obj.add(2, 5, 7);
        obj.add(23.0, 54.78);
        obj.add(23, 89, 75);
    }
}
