package datastructure.multithreading;

public class StopThread implements Runnable{

    private boolean doStop = false;

    public synchronized void doStop(){
        this.doStop = true;
    }

    public synchronized boolean keepRunning(){
        return this.doStop == false;
    }

    @Override
    public void run() {

        if(keepRunning()){
            System.out.println("Thread Execution started...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Stopping Thread...");

    }

    public static void main(String[] args) {
        StopThread stopThread=new StopThread();
        Thread thread=new Thread(stopThread);
        thread.start();

    }
}
