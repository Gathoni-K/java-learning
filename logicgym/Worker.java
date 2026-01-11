



package logicgym;

public abstract class Worker {
    protected String role;

    abstract int getPay();

    void printPay(){
        System.out.println("Pay: " + getPay());
    }
}

class HourlyWorker extends Worker{
    int hoursWorked;
    int hourlyRate;

    HourlyWorker(int hoursWorked, int hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    int getPay(){
        return hoursWorked * hourlyRate;
    }
}

class SalariedWorker extends Worker{
    int monthlySalary = 65000;

    @Override
    int getPay(){
        return monthlySalary;
    }
}

public class Print{
    public static void main(String[]args){

        Worker w1 = new HourlyWorker(40, 500);
        Worker w2 = new SalariedWorker();

        w1.printPay();
        w2.printPay();
    }
}


