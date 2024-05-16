class Ministries extends Thread{
    int ministries;
    MyMinistries governs;

    public Ministries(MyMinistries governs, int ministries){
        this.governs = governs;
        this.ministries = ministries;
    }

    public void run(){
        governs.bookMinistries(ministries);
    }

}

class MyMinistries{
    int total_ministries = 22;

    public synchronized void bookMinistries(int ministries){
        if(total_ministries>=ministries){
            System.out.println("Ministries booked successfully");
            total_ministries = total_ministries - ministries;
            System.out.println("Ministries left: " + total_ministries);
        }else {
            System.out.println("Ministries cannot be booked");
            System.out.println("Ministries left: " + total_ministries);
        }
    }
}

public class Five {
    public static void main(String[] args){
        MyMinistries governs = new MyMinistries();

        Ministries maoist = new Ministries(governs, 7);
        maoist.start();

        Ministries rsp = new Ministries(governs, 4);
        rsp.start();

        Ministries congress = new Ministries(governs, 8);
        congress.start();

        Ministries uml = new Ministries(governs, 10);
        uml.start();
    }
}
