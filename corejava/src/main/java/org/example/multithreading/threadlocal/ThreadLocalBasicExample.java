package org.example.multithreading.threadlocal;

public class ThreadLocalBasicExample {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<>();
        Thread thread1 = new Thread(()->{
           threadLocal.set("Thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String val=threadLocal.get();
            System.out.println(val);
        });

        Thread thread2 = new Thread(()->{
            threadLocal.set("Thread 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String val=threadLocal.get();
            System.out.println(val);
        });

        thread1.start();
        thread2.start();
    }
}
