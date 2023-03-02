package org.example.multithreading.threadsignaling;

public class ThreadSignalExample {
    public static void main(String[] args) {
        SignalCarrier signalCarrier=new SignalCarrier();

        Thread waitingThread = new Thread(() -> {
            try {
                signalCarrier.doWait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread notifyingThread = new Thread(() -> {
            signalCarrier.doNotify();
        });
        waitingThread.start();
        notifyingThread.start();

        /*

             notifyingThread.start();
            waitingThread.start();
         */
    }
}
