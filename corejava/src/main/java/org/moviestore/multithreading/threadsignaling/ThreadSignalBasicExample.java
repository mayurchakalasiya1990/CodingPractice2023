package org.example.multithreading.threadsignaling;

public class ThreadSignalBasicExample {
    public static void main(String[] args) {
        Object singanlObject = new Object();
        Thread waitingThread = new Thread(() -> {
            synchronized (singanlObject) {
                try {
                    System.out.println(Thread.currentThread().getName() + " : waiting...");
                    singanlObject.wait();
                    System.out.println(Thread.currentThread().getName() + " : start processing...");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (singanlObject) {
                System.out.println(Thread.currentThread().getName() + " : notifying...");
                singanlObject.notify();
            }
        });
        waitingThread.start();
        notifyingThread.start();
    }
}
