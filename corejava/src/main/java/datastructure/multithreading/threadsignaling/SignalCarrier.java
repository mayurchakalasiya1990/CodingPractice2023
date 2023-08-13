package datastructure.multithreading.threadsignaling;

public class SignalCarrier {

    public void doWait() throws InterruptedException {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" calling wait()");
            this.wait();
            System.out.println(Thread.currentThread().getName()+" exiting wait()");
        }
    }

    public void doNotify(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+" calling doNotify()");
            this.notify();
            System.out.println(Thread.currentThread().getName()+" exiting doNotify()");
        }
    }
    public void doNotifyAll(){
        System.out.println(Thread.currentThread().getName()+" calling doNotifyAll()");
        this.notifyAll();
        System.out.println(Thread.currentThread().getName()+" exiting doNotifyAll()");
    }
}
