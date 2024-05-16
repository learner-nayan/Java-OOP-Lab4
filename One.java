class FirstThread extends Thread{
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }
    }
}

class SecondThread extends Thread{
    public void run(){
        for (int i=15; i<=20; i++){
            System.out.println(i);
        }
    }
}

class One{
    public static void main(String[] args){
        FirstThread f1 = new FirstThread();
        SecondThread f2 = new SecondThread();
        f1.start();
        f2.start();
    }
}