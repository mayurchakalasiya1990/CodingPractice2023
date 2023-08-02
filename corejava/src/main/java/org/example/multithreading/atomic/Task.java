package org.example.multithreading.atomic;

public class Task implements Runnable{

    private int count;

    public int getCount(){
        return count;
    }


    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++count;
        }

    }
}
