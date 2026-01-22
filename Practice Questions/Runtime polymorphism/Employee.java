

class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void work(){
        System.out.println("We work to earn the right to work, to earn the right to live, to earn the right to die.");
    }
}
interface Coder{
    void code();
}
interface Tester{
    void test();
}

class SoftwareEngineer extends Employee implements Coder, Tester{
    @Override
    void work(){
        System.out.println("Sell your soul for the extra dough");
    }

    public void codec(){
        System.out.println("Live love laugh coding");
    }
    public void test(){
        System.out.println("Test, mic check 1,2");
    }

    public class Print{
        public static void main(String[]args){
            Employee e1 = new SoftwareEngineer();
            Coder e2 = new SoftwareEngineer();
            Tester e3 = new SoftwareEngineer();

            e1.work();
            e2.code();
            e3.test();

        }
    }
}
