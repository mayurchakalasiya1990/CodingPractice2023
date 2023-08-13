package datastructure.multithreading;


class ThreadRunner extends Thread{
    public void run(){
        System.out.println("Thread Using Thread Class");
    }
}
public class ThreadExample {

    public static void main(String[] args) {
        ThreadRunner runner1= new ThreadRunner();
        runner1.start();
        System.out.println("Runner-1 name:"+runner1.getName());
        Runnable runner2 = () -> {
            System.out.println("Thread Using Runnable Interface");
        };

        Thread thread=new Thread(runner2);
        thread.start();
        System.out.println("Runner-2 name:"+thread.getName());
    }
}
