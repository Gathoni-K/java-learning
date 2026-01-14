public class PrintUser {
    public static void main(String[]args){
        User a = new User("Jack", 34);
        User b = new User();
        User c = new User("Jill");

        a.display();
        b.display();
        c.display();
    }
}
