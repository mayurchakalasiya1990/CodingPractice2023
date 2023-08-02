package org.example.multithreading.atomic;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        Task task=new Task();
        Thread thread1=new Thread(task);
        Thread thread2=new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count:"+task.getCount());
    }
}

