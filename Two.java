class FirstRunnable implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(i);;
        }
    }
}

class SecondRunnable implements Runnable{
    public void run(){
        for(int i=10; i<=15; i++){
            System.out.println(i);;
        }
    }
}

public class Two {
    public static void main(String[] args){
        FirstRunnable runnable1 = new FirstRunnable();
        SecondRunnable runnable2 = new SecondRunnable();

        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);

        th1.start();
        th2.start();

    }
}
