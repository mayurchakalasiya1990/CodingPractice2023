package datastructure.multithreading.threadlocal;

public class ThreadLocalInitialValueExample {

    public static void main(String[] args) {
        ThreadLocal<MyObject> threadLocal1 = new ThreadLocal<>(){
            @Override
            protected  MyObject initialValue(){
                return new MyObject();
            }
        };
        ThreadLocal<MyObject> threadLocal2 = ThreadLocal.withInitial(()->{
            return new MyObject();
        });

        Thread thread1 = new Thread(()->{
            System.out.println("Threadlocal1:"+threadLocal1.get());
            System.out.println("Threadlocal1:"+threadLocal2.get());
        });

        Thread thread2 = new Thread(()->{
            System.out.println("Threadlocal1:"+threadLocal1.get());
            System.out.println("Threadlocal1:"+threadLocal2.get());
        });

        //Both thread will get separate copy of two object from threadlocal-1 and threadlocal-2
        thread1.start();
        thread2.start();
    }

}
