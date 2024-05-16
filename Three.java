class TotalSalary extends Thread{
    int salary = 0;

    public void run(){
        synchronized (this){
            for (int i=1;i<=10;i++){
                salary = salary+1000;
            }
            this.notify();
        }
    }
}

public class Three {
    public static void main(String[] args) throws InterruptedException{
        TotalSalary salary = new TotalSalary();
        salary.start();

        synchronized (salary){
            salary.wait();
            System.out.println("Salary : " + salary.salary);
        }
    }
}
