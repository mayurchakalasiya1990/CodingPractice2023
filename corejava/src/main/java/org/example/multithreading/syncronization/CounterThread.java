package org.example.multithreading.syncronization;

public class CounterThread extends Thread{

    protected Counter counter=null;
    public CounterThread(Counter counter){
        this.counter=counter;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            counter.add(i);
            System.out.println("Counter:"+counter.count + " Thread:"+Thread.currentThread().getName());
        }
    }
}
