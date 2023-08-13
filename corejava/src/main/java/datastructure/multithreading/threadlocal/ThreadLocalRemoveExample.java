package datastructure.multithreading.threadlocal;

public class ThreadLocalRemoveExample {

    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<>();
        Thread thread1 = new Thread(()->{
            threadLocal.set("Thread 1");
            String val=threadLocal.get();
            System.out.println(val);

            threadLocal.remove();
            val=threadLocal.get();
            System.out.println(val);
        });

        Thread thread2 = new Thread(()->{
            threadLocal.set("Thread 2");
            String val = threadLocal.get();
            System.out.println(val);

            threadLocal.remove();
            val = threadLocal.get();
            System.out.println(val);
        });

        thread1.start();
        thread2.start();
    }
}
