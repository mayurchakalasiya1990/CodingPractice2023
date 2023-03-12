package org.example.multithreading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTask implements Runnable{

    AtomicInteger count = new AtomicInteger();

    public int getCount(){
        return this.count.get();
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count.getAndIncrement();
        }
    }
}
