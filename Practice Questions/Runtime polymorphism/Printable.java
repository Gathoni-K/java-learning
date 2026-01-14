interface Printable {
    void print();
}

interface Scannable{
    void scan();
}

class PrinterMachine implements Printable, Scannable{
    public void print(){
        System.out.println("Print is running");
    }

    public void scan(){
        System.out.println("Scan is running");
    }

    public static void main(String[]args){
        PrinterMachine obj = new PrinterMachine();

        obj.print();
        obj.scan();
    }
}
