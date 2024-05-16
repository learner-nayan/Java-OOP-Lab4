class MyThread extends Thread{
//    public static int

    public void run(){
        System.out.println("From myThread run method with the priority: " + Thread.currentThread().getPriority());
    }
}


public class Four {
    public static void main(String[] args){
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        System.out.println("Priority of thread one: " + th1.getPriority());
        System.out.println("Priority of thread two: " + th2.getPriority());
        System.out.println("Priority of thread three: " + th3.getPriority());

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Priority of thread one: " + th1.getPriority());
        System.out.println("Priority of thread two: " + th2.getPriority());
        System.out.println("Priority of thread three: " + th3.getPriority());

        th1.setPriority(7);
        th2.setPriority(6);
        th3.setPriority(9);

        System.out.println("Priority of thread one: " + th1.getPriority());
        System.out.println("Priority of thread two: " + th2.getPriority());
        System.out.println("Priority of thread three: " + th3.getPriority());

        th1.start();
        th2.start();
        th3.start();
    }
}
